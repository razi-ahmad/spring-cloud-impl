package org.za.shaikh.microservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MicroserviceBImpl implements MicroserviceB {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public String execute() {
        log.info("******************Microservice B is calling****************");
        return "Microservice B is called";
    }
}
