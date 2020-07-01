package com.iphayao.linebot;


import java.io.IOException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;






import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
//throws ClientProtocolException, IOException
import com.sun.jersey.core.util.MultivaluedMapImpl;









public class Callrest {
    protected String getCV(String Userid) {
    	ClientConfig config = new DefaultClientConfig();
    	  Client client = Client.create(config);
    	  WebResource service = client.resource(UriBuilder.fromUri("http://localhost:8082/rest/prsorderservice/v1/Post/1").build());
    	
    	// getting JSON data
    	  System.out.println(service. path("restPath").path("resourcePath").accept(MediaType.APPLICATION_XML).get(String.class));
    	  
    	  
    	  return "x";
    
    } 
    	
    
}
