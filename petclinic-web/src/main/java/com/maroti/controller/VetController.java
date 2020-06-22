package com.maroti.controller;

import com.maroti.services.VetServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/vet")
@Controller
public class VetController {

    private final VetServices vetServices;

    public VetController(VetServices vetServices) {
        this.vetServices = vetServices;
    }

    @RequestMapping({"", "/", "/index", "index.html"})
    public String vetList(Model model)
    {
        model.addAttribute("vet", vetServices.findAll());
        return "vets/index";
    }
}
