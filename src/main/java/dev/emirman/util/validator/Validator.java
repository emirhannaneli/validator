package dev.emirman.util.validator;

import java.util.List;

public class Validator {
    private String passwordPattern;
    private String emailPattern;
    private String phonePattern;

    Validator() {
        this.passwordPattern = "^(?=.*[a-zA-Z])(?=.*[0-9])[-a-zA-Z0-9@#$%/?€^&+=*._()%!'<>|\\\"\\{\\}\\[\\]\\\\]{6,}-?$";
        this.emailPattern = "^(.+)@(.+)$";
        this.phonePattern = "^(\\+?\\d{1,3}[- ]?)?\\d{10}$";
    }


    public boolean isEmailValid(String email) {
        return isValidObject(email) && isValidString(email) && email.matches(emailPattern);
    }

    public boolean isPhoneValid(String phone) {
        return isValidObject(phone) && isValidString(phone) && phone.matches(phonePattern);
    }

    public boolean isPasswordValid(String password) {
        return isValidObject(password) && isValidString(password) && password.matches(passwordPattern);
    }

    public Boolean isValidString(String string) {
        return isValidObject(string) && !string.isEmpty() && !string.isBlank();
    }

    public Boolean isValidList(List<?> list) {
        return isValidObject(list) && !list.isEmpty();
    }

    public Boolean isValidObject(Object object) {
        return object != null;
    }

    public String passwordPattern() {
        return passwordPattern;
    }

    public Validator withPasswordPattern(String passwordPattern) {
        this.passwordPattern = passwordPattern;
        return this;
    }

    public String emailPattern() {
        return emailPattern;
    }

    public Validator withEmailPattern(String emailPattern) {
        this.emailPattern = emailPattern;
        return this;
    }

    public String phonePattern() {
        return phonePattern;
    }

    public Validator withPhonePattern(String phonePattern) {
        this.phonePattern = phonePattern;
        return this;
    }
}
