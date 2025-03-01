package com.codeAlpha.chatBot;

public class UserInput {
    private String message;

    public UserInput() {}

    public UserInput(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
