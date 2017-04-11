package com.springboot.controller;

import com.springboot.model.Item;
import com.springboot.service.ItemService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("Items")
public class ItemsController {
    ItemService itemService = new ItemService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Item> loadAllItems() {
        Map<String, Item> allItems = itemService.loadAllItems();
        return allItems;
    }
}
