package com.example.jenkinstestapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/jenkins")
public class JenkinsController {

    @GetMapping
    public Map<String, String> jenkins(){
        return Map.of("jenkins-version","1.0.0");
    }
}
