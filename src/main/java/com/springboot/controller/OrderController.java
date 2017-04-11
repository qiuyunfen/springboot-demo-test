package com.springboot.controller;

import com.springboot.model.Order;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("order")
public class OrderController {
    @POST
    @Path("{id}")
    public Response addOrder(@PathParam("id") String Id, Order order) {

        return Response.status(200).entity("订单" + Id + "提交成功").build();
    }
}
