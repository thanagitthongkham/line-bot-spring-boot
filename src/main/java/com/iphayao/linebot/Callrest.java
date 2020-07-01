package com.iphayao.linebot;


import java.io.IOException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;







//throws ClientProtocolException, IOException
import com.sun.jersey.core.util.MultivaluedMapImpl;

import java.io.IOException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import org.apache.http.client.ClientProtocolException;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.representation.Form;









public class Callrest {
    protected String getCV(String Userid) {
//    	ClientConfig config = new DefaultClientConfig();
//    	  Client client = Client.create(config);
//    	  WebResource service = client.resource(UriBuilder.fromUri("http://localhost:8082/rest/prsorderservice/v1/Post/1").build());
//    	
//    	// getting JSON data
//    	  System.out.println(service. path("restPath").path("resourcePath").accept(MediaType.APPLICATION_XML).get(String.class));
//    	  
//    	  
//    	  return "x";
    
    	
    	
    	
    	 ClientConfig config = new DefaultClientConfig();
    	  Client client = Client.create(config);
    	  WebResource service = client.resource(UriBuilder.fromUri("http://localhost:8082/rest/prsorderservice/v1/Post/").build());
    	  Form form = new Form();
    	  form.add("OrderID",Userid);
    	  ClientResponse response = service.path("restPath").path("resourcePath").
    	  type(MediaType.APPLICATION_FORM_URLENCODED).post(ClientResponse.class, form);
    	  System.out.println("Response " + response.getEntity(String.class));
    	  
    	  return "x";
    } 
    	
    
}
