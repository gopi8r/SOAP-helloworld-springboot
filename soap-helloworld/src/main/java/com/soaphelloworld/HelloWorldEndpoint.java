package com.soaphelloworld;

//package com.example.helloworldservice;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class HelloWorldEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/helloworld";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "HelloWorldRequest")
    @ResponsePayload
    public HelloWorld sayHello(@RequestPayload HelloWorld request) {
        HelloWorld response = new HelloWorld();
        response.setMessage("Hello, " + request.getMessage() + "!");
        return response;
    }
}

