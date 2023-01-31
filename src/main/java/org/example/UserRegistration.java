package org.example;

import java.util.regex.Pattern;

public class UserRegistration {

    public boolean firstname(String fName){
        Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        return pattern.matcher(fName).matches();
    }
    public boolean lastname(String lName){
        Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        return pattern.matcher(lName).matches();
    }
    public boolean Email(String email){
        Pattern pattern=Pattern.compile("^[a-zA-Z.]+@(.+)$");
        return pattern.matcher(email).matches();
    }
    public boolean mobileNo(String phone){
        Pattern pattern=Pattern.compile("^[0-9]{2}\\s{1}[0-9]{10}$");
        return pattern.matcher(phone).matches();
    }
    public boolean password(String Password){
        Pattern pattern=Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])[!@#$%^&*()-_+=]{1}.{8,}$");
        return pattern.matcher(Password).matches();
    }
}
