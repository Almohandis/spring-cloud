package org.example.cloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ADMIN")
public interface AdminClient {

    @GetMapping("/admins")
    String getAllAdmins();
}
