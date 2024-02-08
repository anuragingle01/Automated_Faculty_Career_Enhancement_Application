package com.facultyapplication.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/application-form")
    public String showApplicationForm() {
        return "application-form"; // Return the application form page
    }
}
