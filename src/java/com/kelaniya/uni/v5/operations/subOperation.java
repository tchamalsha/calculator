package com.kelaniya.uni.v5.operations;

public class subOperation implements operation {

    public Double execute(Double[] numbers) {
        return numbers[0] - numbers[1];
    }
}