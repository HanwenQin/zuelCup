package com.example.competitiondemo.vo;

import lombok.Data;

@Data
public class JwtAuthenticationResponse {

    private String token;
    private String tokenType = "Bearer";

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }
}
