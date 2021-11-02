package com.example.sample_spring_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private HomeService homeService;

    @GetMapping("/home")
    public String index(@RequestParam(name = "userName") String name) {
        return homeService.getIndexPage(name);
    }

    @PostMapping(value = "/saleProduct", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public StatusResponse productSale(@RequestBody List<Product> products) {
        return new StatusResponse();
    }
}
