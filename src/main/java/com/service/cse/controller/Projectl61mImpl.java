package com.service.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-04-02T14:08:17.202Z")

@RestSchema(schemaId = "projectl61m")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Projectl61mImpl {

    @Autowired
    private Projectl61mDelegate userProjectl61mDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectl61mDelegate.helloworld(name);
    }

}
