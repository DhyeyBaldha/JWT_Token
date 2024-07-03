package com.example3.SpringJWT.Exception;

import lombok.Data;

@Data
public class ErrorResponse {
    private String message;
    private int status;

    public ErrorResponse(String message, int status) {
        this.message = message;
        this.status = status;
    }
}

