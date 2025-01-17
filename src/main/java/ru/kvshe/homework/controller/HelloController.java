package ru.kvshe.homework.controller;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Metrics;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final Counter counter = Metrics.counter("request-count");

    @GetMapping
    public String hello() {
        counter.increment();
        return "Hello World";
    }
}
