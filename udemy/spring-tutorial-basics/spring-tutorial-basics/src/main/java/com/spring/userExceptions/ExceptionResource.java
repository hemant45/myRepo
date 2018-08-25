package com.spring.userExceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.Date;

public class ExceptionResource{
    private Date timestamp;
    private String message;
    private String details;

    public Date getTimestamp() {
        return timestamp;
    }


    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    public ExceptionResource(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
