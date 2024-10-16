package com.karim;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/test")
public class TestResource {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getGreeting(){
        return "welcome man i am karim mohamed";
    }
}
