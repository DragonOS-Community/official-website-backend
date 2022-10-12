package com.dragonos.website.model.vo;

import lombok.Data;

/**
 * "statistics": {
 *         "pr": "123",
 *         "star": "66",
 *         "fork": "11",
 *         "contributors": "23",
 *         "releases": "0",
 *         "updated_time": "2022-10-08"
 *     },
 */
@Data
public class Statistic {

    private String pr;

    private String star;

    private String fork;

    private String contributors;

    private String updatedTime;



}
