package com.kelaniya.uni.v4;

import com.kelaniya.uni.v4.operations.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        commandlineInputs inputs = new commandlineInputs(args);
        String operator = inputs.getOperator();

        fileReader fileReader = new fileReader();
        Double[] numbers = fileReader.getNumbers();
        Double number1 =numbers[0];
        Double number2 =numbers[1];


        OperationFactory operationFactory = new OperationFactory();
        operation operation = operationFactory.getInstance(operator);



        Double result = operation.execute(numbers);

        UI ui= new UI();
        ui.showMessege("The result is "+result);

    }
}
