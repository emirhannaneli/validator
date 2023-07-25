package dev.emirman.util.validator;

import java.util.List;

public class Validator {
    private String passwordPattern;
    private String emailPattern;
    private String phonePattern;

    public Validator() {
        this.passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!.'^@#$%^&+=])(?=\\S+$).{8,}$";
        this.emailPattern = "^(.+)@(.+)$";
        this.phonePattern = "^(\\+?\\d{1,3}[- ]?)?\\d{10}$";
    }


    /*
     * This method checks if the email is valid.
     * It checks if the email is not null, not empty, not blank and matches the email pattern.
     * The email pattern is set to the default value.
     * If you want to change the email pattern, you can use the withEmailPattern method.
     * @param email
     * @return boolean
     * */
    public boolean isValidEmail(String email) {
        return isValidObject(email) && isValidString(email) && email.matches(emailPattern);
    }

    /*
     * This method checks if the phone is valid.
     * It checks if the phone is not null, not empty, not blank and matches the phone pattern.
     * The phone pattern is set to the default value.
     * If you want to change the phone pattern, you can use the withPhonePattern method.
     * @param phone
     * @return boolean
     * */
    public boolean isValidPhone(String phone) {
        return isValidObject(phone) && isValidString(phone) && phone.matches(phonePattern);
    }

    /*
     * This method checks if the password is valid.
     * It checks if the password is not null, not empty, not blank and matches the password pattern.
     * The password pattern is set to the default value.
     * If you want to change the password pattern, you can use the withPasswordPattern method.
     * @param password
     * @return boolean
     */
    public boolean isValidPassword(String password) {
        return isValidObject(password) && isValidString(password) && password.matches(passwordPattern);
    }

    /*
     * This method checks if the string is valid.
     * It checks if the string is not null, not empty and not blank.
     * @param string
     * @return boolean
     * */
    public Boolean isValidString(String string) {
        return isValidObject(string) && !string.isEmpty() && !string.isBlank();
    }

    /*
     * This method checks if the list is valid.
     * It checks if the list is not null and not empty.
     * @param list
     * @return boolean
     * */
    public Boolean isValidList(List<?> list) {
        return isValidObject(list) && !list.isEmpty();
    }

    /*
     * This method checks if the object is valid.
     * It checks if the object is not null.
     * @param object
     * @return boolean
     * */
    public Boolean isValidObject(Object object) {
        return object != null;
    }

    public String passwordPattern() {
        return passwordPattern;
    }

    /*
     * This method sets the password pattern.
     * @param passwordPattern
     * @return Validator
     * */
    public Validator withPasswordPattern(String passwordPattern) {
        this.passwordPattern = passwordPattern;
        return this;
    }

    public String emailPattern() {
        return emailPattern;
    }

    /*
     * This method sets the email pattern.
     * @param emailPattern
     * @return Validator
     * */
    public Validator withEmailPattern(String emailPattern) {
        this.emailPattern = emailPattern;
        return this;
    }

    public String phonePattern() {
        return phonePattern;
    }

    /*
     * This method sets the phone pattern.
     * @param phonePattern
     * @return Validator
     * */
    public Validator withPhonePattern(String phonePattern) {
        this.phonePattern = phonePattern;
        return this;
    }
}
