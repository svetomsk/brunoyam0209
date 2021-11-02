package com.example.sample_spring_project;

import lombok.Data;

@Data
public class StatusResponse {
    private boolean success = true;
    private String error = "";
}
