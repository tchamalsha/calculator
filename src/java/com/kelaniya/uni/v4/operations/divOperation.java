package com.kelaniya.uni.v4.operations;

public class divOperation implements operation {

    public Double execute(Double[] numbers) {
        return numbers[0] / numbers[1];
    }
}