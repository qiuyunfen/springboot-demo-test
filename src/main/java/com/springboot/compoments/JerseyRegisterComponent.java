package com.springboot.compoments;

import com.springboot.controller.HelloWorldResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyRegisterComponent extends ResourceConfig{
    public JerseyRegisterComponent() {
        register(HelloWorldResource.class);
    }
}
