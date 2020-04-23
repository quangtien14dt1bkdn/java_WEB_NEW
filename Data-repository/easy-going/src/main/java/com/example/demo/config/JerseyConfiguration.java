package com.example.demo.config;

import com.example.demo.controller.UserResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/boot-jersey")
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
        register(UserResource.class);
    }
}
