package com.kelaniya.uni.v5.input;

public class CommandlineInputs implements Inputs {

    private final String[] args;

    //constructor of the class
    public CommandlineInputs(String[] arguments){

        this.args = arguments;
    }

    public String getOperator(){
        //make sure to validate the arguments before using...
        if(args.length == 0){
            System.out.println("Please provide the operation as an argument..");
            return "";
        }

        String operator = args[0];
        if (!(operator.equals("add") || operator.equals("mul") || operator.equals("sub") || operator.equals("div"))) {
            System.out.println("provide add,sub or mul as the operator argument!");
            return "";
        }
        return operator;
    }
}
