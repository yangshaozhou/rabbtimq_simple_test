package com.example.product;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestProducer {
    @Autowired
    private StreamBridge streamBridge;

    private static final String PRODUCT_QUEUE = "product-out-0";

    /**
     * 发送消息
     */

    public void product() {
      boolean send = streamBridge.send(PRODUCT_QUEUE,"你好");
      log.info("send : {}",send);

    }
}
