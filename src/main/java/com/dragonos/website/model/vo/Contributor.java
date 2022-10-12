package com.dragonos.website.model.vo;

import lombok.Data;

@Data
public class Contributor {

    /**
     *   {
     *             "order": "0",
     *             "avatar": "https://avatars.githubusercontent.com/u/63215266?s=64&v=4",
     *             "name": "longjin",
     *             "email": "longjin@RinGoTek.cn"
     *         },
     */
    private String order;

    private String avatar;

    private String name;

    private String email;


}
