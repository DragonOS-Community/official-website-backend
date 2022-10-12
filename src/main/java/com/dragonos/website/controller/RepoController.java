package com.dragonos.website.controller;

import com.dragonos.website.model.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
@RequestMapping(value = "/repo")
public class RepoController {

    @GetMapping("/info")
    public JsonResult info(){
        return null;
    }
}
