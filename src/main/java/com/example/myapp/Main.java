package com.example.myapp;

public class Main {
    public static void main(String[] args) {
        var calculator = new Calculator();
        int result = calculator.add(1, 2);
        System.out.println("1 + 2 = " + result);
    }
}
