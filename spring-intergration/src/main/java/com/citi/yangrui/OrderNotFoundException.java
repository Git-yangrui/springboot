package com.citi.yangrui;

public class OrderNotFoundException extends RuntimeException {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrderNotFoundException(String id) {
        this.id=id;
    }
}
