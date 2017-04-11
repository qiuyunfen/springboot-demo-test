package com.springboot.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import com.springboot.model.Promotion;
import com.springboot.service.PromotionService;

import java.util.List;
import java.util.Map;

@Path("promotions")
public class PromotionsController {
    PromotionService promotionService = new PromotionService();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //http://localhost:8080/promotions?barcodes=ITEM000000&barcodes=ITEM000001
    public Map<String, String> loadPromotionByBarcode(@QueryParam("barcodes") List<String> barcodes) {
        Map<String, String> promotions= promotionService.loadPromotionByBarcode(barcodes);
        return promotions;
    }
}
