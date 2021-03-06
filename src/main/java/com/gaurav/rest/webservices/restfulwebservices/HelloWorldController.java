package com.gaurav.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class HelloWorldController {

    @GetMapping( path ="/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    //hello-world-bean
    @GetMapping( path ="/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping( path ="/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldParam(@PathVariable String name){

        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
