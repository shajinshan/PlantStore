package com.ryncoorchids.ryncoOrchids.exception;

import java.util.List;

public class ProductException extends RuntimeException{
    List<String> error;
    String message;

    public ProductException(List<String> error, String message) {
        this.error = error;
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }

    public List<String> getError() {
        return error;
    }


}
