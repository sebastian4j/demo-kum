package com.sebastian.demo.kum;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/rest")
public class RestResource {
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response getResources() {
    final Map<String, String> json = new HashMap<>();
    json.put("dev", "kumx");
    return Response.ok(json).build();
  }

  @GET
  @Path("/xy")
  @Produces(MediaType.APPLICATION_JSON)
  public Response getX() {
    final Map<String, String> json = new HashMap<>();
    json.put("x", "y");
    return Response.ok(json).build();
  }
}
