package org.example.cloud.config;

import org.example.cloud.client.AdminClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfigurations {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
