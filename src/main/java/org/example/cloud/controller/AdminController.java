package org.example.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AdminController {

    private final RestTemplate restTemplate;

    public AdminController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("admins")
    public String getAdmins() {
        return restTemplate.getForObject("http://localhost:8089", String.class);
    }
}
