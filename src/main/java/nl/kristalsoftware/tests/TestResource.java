package nl.kristalsoftware.tests;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class TestResource {

    @GET
    public String getTest() {
        return "Dit is een test";
    }
    
}
