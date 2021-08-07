package com.kelaniya.uni;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        add sum=new add();
        multi mul=new multi();
        sub sub = new sub();
        Scanner scanner=new Scanner(System.in);

        String[] nums = readText();
        float number1 = Float.parseFloat(nums[0]);
        float number2 = Float.parseFloat(nums[1]);


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
    static String[] readText() {
        String[] nums = {};
        try {
            File myObj = new File("src/java/com/kelaniya/uni/numbers");
            Scanner myReader = new Scanner(myObj);
            String data=myReader.nextLine();
           nums=data.split(" ",0);

            myReader.close();


        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
        return  nums;
    }
}
