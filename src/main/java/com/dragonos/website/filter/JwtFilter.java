package com.dragonos.website.filter;

import com.alibaba.fastjson.JSONObject;
import com.dragonos.website.model.JsonResult;
import com.dragonos.website.utils.ContextHolder;
import com.dragonos.website.utils.JwtTokenUtil;
import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Component
public class JwtFilter extends HandlerInterceptorAdapter {

    public static final String LOGIN_URL = "/login";

    public static final String LANKA_URL = "/abc";

    @Resource
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        if (uri.contains(LOGIN_URL) || uri.contains(LANKA_URL) || uri.contains("/doc.html") || uri.contains("/swagger-resources") || uri.contains("/error")) {
            return true;
        }
        if (request.getMethod().equals("OPTIONS")) {
            response.setStatus(HttpServletResponse.SC_OK);
            return true;

        }
        //获取token
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        String token = request.getHeader(jwtTokenUtil.header);
        if (StringUtils.isEmpty(token)) {
            token = request.getParameter(jwtTokenUtil.header);
        }
        if (StringUtils.isEmpty(token)) {
            PrintWriter out = null;
            JsonResult jsonResult = JsonResult.TokenErrorJson("token不能为空");
            out = response.getWriter();
            out.append(JSONObject.toJSONString(jsonResult));
//            throw new RuntimeException(jwtTokenUtil.header + "不能为空");
            return false;
        }

        //判断token是否超时
        Claims claims = jwtTokenUtil.getTokenClaim(token);
        if (null == claims || jwtTokenUtil.isTokenExpired(claims.getExpiration())) {
            PrintWriter out = null;
            JsonResult jsonResult = JsonResult.TokenErrorJson("登录失效，请重新登录");
            out = response.getWriter();
            out.append(JSONObject.toJSONString(jsonResult));
//            throw new RuntimeException(jwtTokenUtil.header + "失效，请重新登录");
            return false;
        }
        ContextHolder.setHolder(token);
        return true;
    }
}
