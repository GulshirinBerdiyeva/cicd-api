package com.bgb.dev.cicdapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/crud")
public class ApiController {

    @GetMapping
    private String getText() {
        return "Response from CRUD Api";
    }
}
