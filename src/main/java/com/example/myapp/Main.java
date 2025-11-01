package com.example.myapp;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main {
    static void main() throws IOException {
        String ascii = FigletFont.convertOneLine("Hello World!");
        System.out.println(ascii);

        var calculator = new Calculator();
        int result = calculator.add(1, 2);
        System.out.println("1 + 2 = " + result);
    }
}
