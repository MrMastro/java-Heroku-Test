package com.example.models;

public class ResponseDefault {
    public ResponseDefault(String text){
        this.text = text;
    }
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}