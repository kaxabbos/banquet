package com.banquet.controller;

import com.banquet.controller.main.Attributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/masters")
public class MastersCont extends Attributes {
    @GetMapping
    public String Masters(Model model) {
        AddAttributesMasters(model);
        return "masters";
    }
}
