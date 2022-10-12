package com.dragonos.website.model.vo;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 *  "project_link": {
 *         "github": "https://github.com/fslongjin/DragonOS",
 *         "gitee": "https://gitee.com/DragonOS/DragonOS"
 *     },
 *     "statistics": {
 *         "pr": "123",
 *         "star": "66",
 *         "fork": "11",
 *         "contributors": "23",
 *         "releases": "0",
 *         "updated_time": "2022-10-08"
 *     },
 */
@Data
public class Info {

    private Map<String,String> projectLink;

    private Statistic statistic;

    private List<Contributor> contributorList;

}
