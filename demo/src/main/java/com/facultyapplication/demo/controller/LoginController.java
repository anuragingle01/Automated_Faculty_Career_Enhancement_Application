package com.facultyapplication.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.facultyapplication.demo.service.FacultyLoginService;

@Controller
public class LoginController {

    @Autowired
    private FacultyLoginService facultyLoginService; // Inject FacultyLoginService

 
    @GetMapping("/faculty/login")
    public String showLoginPage() {
        return "login"; // Assuming "login.html" is the login page template
    }

    @PostMapping("/login")
    public String login(@RequestParam("email") String email,
                        @RequestParam("password") String password,
                        Model model) {
        // Check if the provided credentials are valid
        if (facultyLoginService.isValidCredentials(email, password)) {
            return "redirect:/application-form"; // Redirect to the application form page
        } else {
            model.addAttribute("error", "Invalid email or password"); // Add error message to the model
            return "login"; // Return to the login page with error message
        }
    }
}
