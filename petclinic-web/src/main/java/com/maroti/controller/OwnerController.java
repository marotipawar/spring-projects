package com.maroti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping("ownerIndex")
    public String ownerIndex()
    {
        return "owner/index";
    }
}
