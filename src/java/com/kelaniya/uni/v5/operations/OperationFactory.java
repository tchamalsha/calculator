package com.kelaniya.uni.v5.operations;

public class OperationFactory {

    public operation getInstance(String operator){

        operation operation=null;
        if (operator.equals("add")) {
            operation = new AddOperation();
        } else if (operator.equals("sub")) {
            operation= new SubOperation();
        } else if (operator.equals("mul")) {
            operation = new MulOperation();
        }else if (operator.equals("div")) {
            operation = new DivOperation();
        }//violation of OCP
        return operation;
    }

}
