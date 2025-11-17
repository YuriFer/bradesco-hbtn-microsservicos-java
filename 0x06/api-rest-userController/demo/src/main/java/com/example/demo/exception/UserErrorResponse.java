package com.example.demo.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserErrorResponse {
    private int status;
    private String message;
}
