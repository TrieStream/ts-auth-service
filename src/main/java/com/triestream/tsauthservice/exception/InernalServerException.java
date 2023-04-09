package com.triestream.tsauthservice.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InernalServerException extends RuntimeException {

    public InernalServerException(String message) {
        super(message);
    }
}
