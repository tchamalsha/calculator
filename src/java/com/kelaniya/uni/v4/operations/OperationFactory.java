package com.kelaniya.uni.v4.operations;

public class OperationFactory {

    public operation getInstance(String operator){

        operation operation=null;
        if (operator.equals("add")) {
            operation = new addOperation();
        } else if (operator.equals("sub")) {
            operation= new subOperation();
        } else if (operator.equals("mul")) {
            operation = new mulOperation();
        }
        return operation;
    }

}
