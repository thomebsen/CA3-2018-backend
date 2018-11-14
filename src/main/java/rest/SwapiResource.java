/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import facade.swapiFacade;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Andreas
 */
@Path("swapi")
public class SwapiResource {
    
    swapiFacade sf;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SwapiResource
     */
    public SwapiResource() {
    }

    /**
     * Retrieves representation of an instance of rest.SwapiResource
     * @return an instance of java.lang.String
     */
    @GET
    
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@PathParam("id") String data) {
        System.out.println("hej");
        return sf.SwapiURL(data); 
    }

    /**
     * PUT method for updating or creating an instance of SwapiResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
