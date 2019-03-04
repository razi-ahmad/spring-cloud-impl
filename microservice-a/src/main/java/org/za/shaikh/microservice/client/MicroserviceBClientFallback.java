package org.za.shaikh.microservice.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MicroserviceBClientFallback implements MicroserviceBClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(MicroserviceBClientFallback.class);

    @Override
    public String callServiceB() {
        LOGGER.error("Error during calling microservice b");
        return "Empty";
    }
}