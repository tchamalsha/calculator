package com.kelaniya.uni.v3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        commandlineInputs inputs = new commandlineInputs(args);
        String operator = inputs.getOperator();

        fileReader fileReader = new fileReader();
        Double[] numbers = fileReader.getNumbers();
        Double number1 =numbers[0];
        Double number2 =numbers[1];
        double result = 0;
        if (operation.equals("add")) {
            result = number1 + number2;
        } else if (operation.equals("sub")) {
            result = number1 - number2;
        } else if (operation.equals("mul")) {
            result = number1 * number2;
        }

        //or we can use switch case statement
        System.out.println("The result is " + result);

    }
}
