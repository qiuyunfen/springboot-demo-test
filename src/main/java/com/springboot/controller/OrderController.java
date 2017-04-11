package com.springboot.controller;

import com.springboot.model.Order;
import com.springboot.service.OrderService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("order")
public class OrderController {
    OrderService orderService = new OrderService();

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{id}")
    public String addOrder(@PathParam("id") String Id, Order order) {
        System.out.print(order.getSum()+"--------"+Id);
        int orderId = orderService.addOrder(order);
        return "订单" + Id + "提交成功";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int getOrderId() {
        System.out.print(orderService.getOrderId());
        return orderService.getOrderId();
    }
}
