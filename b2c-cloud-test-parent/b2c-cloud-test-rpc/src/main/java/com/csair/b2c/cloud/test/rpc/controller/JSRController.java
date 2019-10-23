package com.csair.b2c.cloud.test.rpc.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created on 2018/9/7.<br/>
 *
 * @author yudong
 */
@Path("/jsr")
public class JSRController {
    @GET
    @Path("/welcome")
    @Produces("text/plain")
    public String welcome() {
        return "hello world";
    }
}
