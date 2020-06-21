package com.maroti.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String indexPage()
    {
        return "index";
    }
}
