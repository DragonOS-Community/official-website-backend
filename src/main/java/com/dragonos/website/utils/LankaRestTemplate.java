package com.dragonos.website.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dragonos.website.model.lanka.coupon.CouponReq;
import com.dragonos.website.model.lanka.coupon.CouponReqItem;
import com.dragonos.website.model.lanka.charge.ChargeBf;
import com.dragonos.website.model.lanka.LankaResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@Slf4j
public class LankaRestTemplate {

    @Value("${lanka.address}")
    private String host;

    @Value("${lanka.parkNumber}")
    private String parkNumber;

    @Value("${lanka.key}")
    private String key;


    public LankaResult postToDisCoupon(List<CouponReqItem> data) {
        CouponReq couponReq = new CouponReq();
        couponReq.setParkNumber(parkNumber);
        couponReq.setDatas(data);

        String url = host + "/out/coupon";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        //设置请求格式
        headers.setContentType(type);
        headers.add("sign", MD5.stringToMD5(key + parkNumber));


        String jsonData = JSON.toJSONString(couponReq);
        HttpEntity httpEntity = new HttpEntity<>(jsonData, headers);
        log.info("=======HttpUrl=======" + url);
        log.info("=======HttpEntity====" + httpEntity.toString());

        ResponseEntity<String> stringResponseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);
        String body = stringResponseEntity.getBody();
        LankaResult lankaResult = JSONObject.parseObject(body, LankaResult.class);
        return lankaResult;
    }

    public LankaResult getChargebf(ChargeBf chargeBf) {


        String url = host + "/out/getChargebf";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        //设置请求格式
        headers.setContentType(type);
        headers.add("sign", MD5.stringToMD5(key + parkNumber));


        String jsonData = JSON.toJSONString(chargeBf);
        HttpEntity httpEntity = new HttpEntity<>(jsonData, headers);
        log.info("=======HttpUrl=======" + url);
        log.info("=======HttpEntity====" + httpEntity.toString());

        ResponseEntity<String> stringResponseEntity = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);
        String body = stringResponseEntity.getBody();
        LankaResult lankaResult = JSONObject.parseObject(body, LankaResult.class);
        return lankaResult;
    }


}
