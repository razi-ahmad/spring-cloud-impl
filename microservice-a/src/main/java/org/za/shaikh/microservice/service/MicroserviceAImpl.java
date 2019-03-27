package org.za.shaikh.microservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.za.shaikh.microservice.client.MicroserviceBClient;

@Service
public class MicroserviceAImpl implements MicroserviceA {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private MicroserviceBClient serviceBClient;

    @Override
    public String execute() {
        log.debug("Microservice A is calling");
        return serviceBClient.callServiceB();
    }
}
