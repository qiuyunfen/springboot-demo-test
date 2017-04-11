package com.springboot.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.springboot.model.Promotion;
import com.springboot.service.PromotionService;

import java.util.Map;

@Path("promotions")
public class PromotionsController {
    PromotionService promotionService = new PromotionService();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Promotion> loadAllPromotions() {
        Map<String, Promotion> allPromotions= promotionService.loadAllPromotions();
        return allPromotions;
    }
}
