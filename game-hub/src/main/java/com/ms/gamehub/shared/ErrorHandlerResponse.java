package com.ms.gamehub.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class ErrorHandlerResponse {

    public ErrorHandlerResponse(String errorMessage, String exceptionMessage) {
        this.errorMessage = errorMessage;
        this.exceptionMessage = exceptionMessage;
        this.timestamp = LocalDateTime.now();
    }

    @JsonProperty("error_message")
    private String errorMessage;

    @JsonProperty("exception_message")
    private String exceptionMessage;

    private LocalDateTime timestamp;

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
