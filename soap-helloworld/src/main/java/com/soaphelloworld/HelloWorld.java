package com.soaphelloworld;

//package com.example.helloworldservice;

//import javax.xml.bind.annotation.XmlRootElement;

@jakarta.xml.bind.annotation.XmlRootElement
public class HelloWorld {
    private String message;

    public HelloWorld() {}

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

