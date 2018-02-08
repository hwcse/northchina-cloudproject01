package com.service.northchinacloudproject01.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-02-08T14:28:02.500Z")

@RestSchema(schemaId = "northchinacloudproject01")
@RequestMapping(path = "/northchinacloudproject01", produces = MediaType.APPLICATION_JSON)
public class Northchinacloudproject01Impl {

    @Autowired
    private Northchinacloudproject01Delegate userNorthchinacloudproject01Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userNorthchinacloudproject01Delegate.helloworld(name);
    }

}
