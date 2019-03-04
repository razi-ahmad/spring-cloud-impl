package org.za.shaikh.microservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "microservice-b", fallback = MicroserviceBClientFallback.class)
public interface MicroserviceBClient {

    @GetMapping("/service-b/bar")
    String callServiceB();

}