package com.cms_project.democms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.cms_project.democms.service.CustomerService;

@Controller
public class CustomerController {

    @Autowired
    CustomerService service;

    @GetMapping("/customers")
    public String list(Model model) {
        model.addAttribute("customers", service.findAll());
        return "customers";
    }
}
