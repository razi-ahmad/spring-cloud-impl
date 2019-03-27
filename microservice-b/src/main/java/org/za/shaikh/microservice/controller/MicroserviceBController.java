package org.za.shaikh.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.za.shaikh.microservice.service.MicroserviceB;

@RequestMapping("/service-b")
@RestController
public class MicroserviceBController {

    @Autowired
    private MicroserviceB service;

    @GetMapping("/bar")
    public String callServiceB() {
        return service.execute();
    }
}
