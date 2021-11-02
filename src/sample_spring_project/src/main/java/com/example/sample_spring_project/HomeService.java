package com.example.sample_spring_project;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
    public String getIndexPage(String name) {
        return String.format("Hello, %s!", name);
    }
}
