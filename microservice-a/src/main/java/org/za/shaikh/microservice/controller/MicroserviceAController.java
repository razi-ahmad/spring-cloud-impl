package org.za.shaikh.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.za.shaikh.microservice.service.MicroserviceA;

@RequestMapping("service-a")
@RestController
public class MicroserviceAController {

    @Autowired
    private MicroserviceA service;

    @GetMapping("/foo")
    public String foo() {
        return service.execute();
    }

}
