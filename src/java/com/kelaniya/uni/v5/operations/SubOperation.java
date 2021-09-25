package com.kelaniya.uni.v5.operations;

public class SubOperation implements Operation {

    public Double execute(Double[] numbers) {
        return numbers[0] - numbers[1];
    }
}