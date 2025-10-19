package edu.fra.uas.hello.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping("/info")
    public Map<String, Object> info() {
        return Map.of(
            "app", "hello",
            "status", "ok",
            "author", "mahir"
        );
    }
}
