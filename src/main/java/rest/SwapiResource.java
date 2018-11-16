/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.GsonBuildConfig;
import facade.PeopleFacade;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.annotation.security.RolesAllowed;
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

    PeopleFacade pf = new PeopleFacade();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SwapiResource
     */
    public SwapiResource() {
    }

    /**
     * Retrieves representation of an instance of rest.SwapiResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/person/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getSwapiPeople(@PathParam("id") int id) throws MalformedURLException, IOException {
        return pf.getSwapiCharacter(id);
    }

    @GET
    @Path("/person")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllSwapiPeople() throws MalformedURLException, IOException {
        return pf.getAllSwapiPeople();
    }

    @GET
    @Path("/favorit")
    @Produces(MediaType.APPLICATION_JSON)
    public String getMyFavorite() throws IOException {

        String jsonStr = pf.getFavoritesCharacters().toString();

        return jsonStr;
    }

    /**
     * PUT method for updating or creating an instance of SwapiResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
