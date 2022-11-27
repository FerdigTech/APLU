package com.amaaya.pwdstrengthchecker.model;

public class Result {
    private String passwordStrength;
    private String message;

    public Result() {

    }
    public Result(String passwordStrength, String message) {
        this.passwordStrength = passwordStrength;
        this.message = message;
    }


    public String getPasswordStrength() {
        return passwordStrength;
    }

    public void setPasswordStrength(String passwordStrength) {
        this.passwordStrength = passwordStrength;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
