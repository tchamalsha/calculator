package com.kelaniya.uni.v1;

public class multi {

    float number1;
    float number2;
    float answer;

    public float multiplication(float num1,float num2){
        this.number1=num1;
        this.number2=num2;

        this.answer=num1*num2;
        System.out.println("Your numbers are multiplied!!");
        return answer;

    }
}
