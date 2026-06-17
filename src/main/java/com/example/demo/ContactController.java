package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")   // allow requests from the frontend (dev mode)
public class ContactController {

    /**
     * Handles POST /contact from the landing page form.
     * Prints the submitted data to the console (no DB yet).
     */
    @PostMapping("/contact")
    public String handleContact(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message) {

        // Print to console — Task 1 requirement (no DB yet)
        System.out.println("=== New Contact Form Submission ===");
        System.out.println("Name    : " + name);
        System.out.println("Email   : " + email);
        System.out.println("Message : " + message);
        System.out.println("===================================");

        return "Form submitted successfully! We'll reach out to " + name + " at " + email + " soon.";
    }
}