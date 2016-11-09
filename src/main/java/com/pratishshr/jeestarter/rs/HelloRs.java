package com.pratishshr.jeestarter.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Pratish Shrestha <pratishshrestha@lftechnology.com>
 */
@Path("/")
public class HelloRs {

    @GET
    @Path("/")
    public String hello() {
        return "Hello World";
    }
}
