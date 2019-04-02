package com.service.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectl61m {

        Projectl61mDelegate projectl61mDelegate = new Projectl61mDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectl61mDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}