package com.example.hello;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.util.ArrayList;
import java.util.List;





/**
 * Hello word!
 */
public class Application {



    public static void main(String[] args) {

        test();
    }
    
    @Test
    public static void test(){
    	Assert.fail("test fail!");
    }

}