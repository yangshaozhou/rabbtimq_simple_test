package com.example.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@Slf4j
public class TestConsumer {


    @Bean
    Consumer<String> consume() {
       return message -> {
           log.error(String.valueOf(message));
       };
    }
}
