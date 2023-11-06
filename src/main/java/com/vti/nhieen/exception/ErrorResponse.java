package com.vti.nhieen.exception;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Map;

@Setter
@Getter
public class ErrorResponse {

    private String timestamp;
    private String message;
    private Map<String, String> errors;

    public ErrorResponse(String message) {
        this.timestamp = LocalDateTime.now().toString(); // lay thoi gian hien ti luc chay code roi du ra man hinh

        this.message = message;
    }

    public ErrorResponse(String message, Map<String, String> errors) {
        this(message);// tai su dung contrucstor cua message o phia tren (public ErrorResponse(String message))
        this.errors = errors;
    }
}
