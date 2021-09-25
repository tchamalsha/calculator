package com.kelaniya.uni.v5.operations;


import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class OperationFactoryTest {

    //test cases
    //1. if the operator is add -> should return as object of AddOperation class
    @Test
    public void sgould_return_AddOperation_object_when_operator_is_add(){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("add");

        //verify that the operation object is an instance of AddOperation class
        assertThat(operation,  instanceOf(AddOperation.class));
    }
    //2. if the operator is sub -> should return as object of SubOperation class
    @Test
    public void sgould_return_SubOperation_object_when_operator_is_sub(){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("sub");

        //verify that the operation object is an instance of AddOperation class
        assertThat(operation,  instanceOf(SubOperation.class));
    }
    //3. if the operator is mul -> should return as object of MulOperation class
    //4. if the operator is div -> should return as object of DivOperation class
}