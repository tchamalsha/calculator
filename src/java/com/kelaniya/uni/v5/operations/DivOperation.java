package com.kelaniya.uni.v5.operations;

public class DivOperation implements operation {

    public Double execute(Double[] numbers) throws InvalidOperationEception {
        if(numbers[0]==0){
            throw new InvalidOperationEception("Do not divide by zero");
        }
        return numbers[0] / numbers[1];
    }
}