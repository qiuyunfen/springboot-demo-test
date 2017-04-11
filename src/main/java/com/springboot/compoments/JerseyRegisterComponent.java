package com.springboot.compoments;

import com.springboot.controller.HelloWorldResource;
import com.springboot.controller.ItemsController;
import com.springboot.controller.PromotionsController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyRegisterComponent extends ResourceConfig{
    public JerseyRegisterComponent() {
        register(HelloWorldResource.class)
                .register(ItemsController.class)
                .register(PromotionsController.class);
    }
}
