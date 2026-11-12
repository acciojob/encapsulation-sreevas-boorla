package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // Task 4: Try setting a value to name by directly accessing it using obj and also try printing it
        // obj.name = "John";
        // System.out.println(obj.name);
        // Error: name has private access in RWOnly

        // Task 6: Now, try setting a value to name in the Main function using the setter function and access its value using the getter function
        obj.setName("John");
        System.out.println(obj.getName());
    }
}