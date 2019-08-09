package Assign3_3;

import Assign3_3.Assign3_3;

public class Assign3_3 {

    // block to be executed before any constructor. 
    { 
        System.out.println("init block"); 
    } 
  
    // no-arg constructor 
    Assign3_3() 
    { 
        System.out.println("default"); 
    } 
  
    // constructor with one arguemnt. 
    Assign3_3(int x) 
    { 
        System.out.println(x); 
    } 
  
    public static void main(String[] args) 
    { 
        // Object creation by calling no-argument  
        // constructor. 
        new Assign3_3(); 
  
        // Object creation by calling parameterized  
        // constructor with one parameter. 
        new Assign3_3(10); 
    } 
} 
	

