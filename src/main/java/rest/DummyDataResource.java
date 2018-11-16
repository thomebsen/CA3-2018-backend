/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import facade.DummyDataFacade;
import facade.PeopleFacade;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
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
@Path("dummy")
public class DummyDataResource {
    DummyDataFacade ddf = new DummyDataFacade();
    Gson gson = new Gson();
    
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SwapiResource
     */
    public DummyDataResource() {
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllItems() {
        return gson.toJson(ddf.getAllDummyPersons());
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
