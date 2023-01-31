package com.bridgelabz;

import org.example.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstnameShouldReturnTrue(){
        UserRegistration registration=new UserRegistration();
        boolean result=registration.firstname("Swamini");
        Assertions.assertEquals(true,result);
    }
    @Test
    public void givenLastnameShouldReturnTrue(){
        UserRegistration registration=new UserRegistration();
        boolean result=registration.lastname("Kumbhare");
        Assertions.assertEquals(true,result);
    }
    @Test
    public void givenEmailShouldReturnTrue(){
        UserRegistration registration=new UserRegistration();
        boolean result=registration.Email("abc.xyz@bl.co.in");
        Assertions.assertEquals(true,result);
    }
    @Test
    public void givenMobileNoShouldReturnTrue(){
        UserRegistration registration=new UserRegistration();
        boolean result=registration.mobileNo("91 9919819801");
        Assertions.assertEquals(true,result);
    }
    @Test
    public void givenPasswordShouldReturnTrue(){
        UserRegistration registration=new UserRegistration();
        boolean result=registration.password("Swamini#12");
        Assertions.assertEquals(true,result);
    }

}
