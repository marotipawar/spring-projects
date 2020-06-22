package com.maroti.controller;

import com.maroti.services.OwnerServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owner")
@Controller
public class OwnerController {

    private final OwnerServices os;

    public OwnerController(OwnerServices os) {
        this.os = os;
    }

    @RequestMapping({"","/", "index", "index.html"})
    public String ownerList(Model model)
    {
        model.addAttribute("owner", os.findAll());
        return "owner/index";
    }
}
