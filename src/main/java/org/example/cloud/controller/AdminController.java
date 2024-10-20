package org.example.cloud.controller;

import org.example.cloud.client.AdminClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AdminController {

    private final RestTemplate restTemplate;
    private final AdminClient adminClient;

    public AdminController(RestTemplate restTemplate, AdminClient adminClient) {
        this.restTemplate = restTemplate;
        this.adminClient = adminClient;
    }

    @GetMapping("/get-admins")
    public ResponseEntity<String> getAdmins() {
//        return restTemplate.getForObject("http://localhost:8089", String.class);
        return ResponseEntity.ok(adminClient.findAllAdmins());
    }
}
