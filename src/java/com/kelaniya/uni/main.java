package com.kelaniya.uni;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        add sum=new add();
        multi mul=new multi();
        sub sub = new sub();
        Scanner scanner=new Scanner(System.in);

        String[] num1;
        String num2;
        float number1 = 10;
        float number2=13;
        String data = null;

        try {
            File myObj = new File("src/java/com/kelaniya/uni/numbers");
            Scanner myReader = new Scanner(myObj);
            this.data=scanner.nextLine();
            
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        num1=data.split(" ",0);
        System.out.println(Arrays.toString(num1));
        System.out.println("Enter the mathematical operation(sum,mul,sub): ");
        String operation=scanner.next();
        if (operation.equals("sub")){
            System.out.println(sub.substraction(number1,number2));
        }
        if (operation.equals("sum")){
            System.out.println(sum.adding(number1,number2));
        }
        if (operation.equals("mul")){
            System.out.println(mul.multiplication(number1,number2));
        }

    }
}
