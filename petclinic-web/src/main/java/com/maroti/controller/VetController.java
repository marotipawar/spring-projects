package com.maroti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping("vetIndex")
    public String vetIndex()
    {
        return "vets/index";
    }
}
