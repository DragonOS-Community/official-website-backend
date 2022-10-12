package com.dragonos.website.shedule;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * 定时获取仓库的贡献者数据
 */

@Component
public class GetRepoContributor {

    @Value("${github.header.accept}")
    private String accept;

    @Value("${github.auth.token}")
    private String token;

    @Value("${github.params.owner}")
    private String owner;

    @Value("${github.params.repo}")
    private String repo;


    public Object listContributor() {
        String path = "https://api.github.com/repos/" + owner + "/" + repo + "/contributors";
        System.out.println(path);
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("accept", accept);
        headers.set("auth", token);
        HttpEntity<Object> objectHttpEntity = new HttpEntity<>(headers);
        Object forObject = restTemplate.exchange(path, HttpMethod.GET, objectHttpEntity, Object.class);
        System.out.println(forObject);
        return forObject;
    }
}


/**
 * Parameters
 * Headers
 * Name, Type, Description
 * acceptstring
 * Setting to application/vnd.github+json is recommended.
 * <p>
 * Path parameters
 * Name, Type, Description
 * ownerstringRequired
 * The account owner of the repository. The name is not case sensitive.
 * <p>
 * repostringRequired
 * The name of the repository. The name is not case sensitive.
 * <p>
 * Query parameters
 * Name, Type, Description
 * anonstring
 * Set to 1 or true to include anonymous contributors in results.
 * <p>
 * per_pageinteger
 * The number of results per page (max 100).
 * <p>
 * Default: 30
 * <p>
 * pageinteger
 * Page number of the results to fetch.
 * <p>
 * Default: 1
 **/
