package com.example.controller;

import com.example.product.TestProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestProducer testProducer;

    @GetMapping("/product")
    public void TestProducer() {
        log.info("test");
        testProducer.product();
    }
}
