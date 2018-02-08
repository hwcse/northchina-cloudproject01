package com.service.northchinacloudproject01.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestNorthchinacloudproject01 {

        Northchinacloudproject01Delegate northchinacloudproject01Delegate = new Northchinacloudproject01Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = northchinacloudproject01Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}