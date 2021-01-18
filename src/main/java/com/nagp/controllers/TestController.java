package com.nagp.controllers;

import com.nagp.RestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class TestController {

    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private RestService restService;

    @GetMapping
    public String getTest() {
        LOG.info("Test Method");
        return "order service";
    }

    @GetMapping(value = "/test")
    public String getOrder() {
        LOG.info("get Order Method");
        String product = restService.restTemplate().getForObject("http://localhost:9090/product/test", String.class);
        return "this is test order" + product;
    }

    public RestService getRestService() {
        return restService;
    }

    public void setRestService(RestService restService) {
        this.restService = restService;
    }
}
