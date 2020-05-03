package com.honeybadgers.realtimescheduler.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/test")
@Slf4j
public class HelloWorldController {

    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello World";
    }

    @GetMapping("/error")
    public ResponseEntity<?> getError() {
        return ResponseEntity.badRequest().build();
    }

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public ResponseEntity<String> helloUser(@PathVariable String name) {
        return ResponseEntity.ok().header("Test", "Test").body("Hello " + name);
    }

    @GetMapping("/param")
    public ResponseEntity<String> helloUserRequestParams(@RequestParam(required = false) String name) {
        return ResponseEntity.ok("Hello " + name);
    }

    @PostMapping("/logging")
    public ResponseEntity<?> loggingBody(@RequestBody String logBody) {
        log.info(logBody);
        return ResponseEntity.accepted().build();
    }

}