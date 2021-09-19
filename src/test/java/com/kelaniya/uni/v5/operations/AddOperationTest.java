package com.kelaniya.uni.v5.operations;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class AddOperationTest {

    // test cases
    // positive number + positive number => correct answer => 5,6 =>11
    // zero + zero => zero => 0,0 => 0
    // negative number + negative number => correct answer => -2,-3 => -5
    // negative number + positive number => correct answer => -1,3 => 2



    @Test
    public void should_add_positive_values(){
        AddOperation addOperation= new AddOperation();
        Double result = addOperation.execute(new Double[]{5.0,6.0});
        assertThat(result,is(11.0));

    }

    @Test
    public void should_add_zeros(){
        AddOperation addOperation= new AddOperation();
        Double result = addOperation.execute(new Double[]{0.0,0.0});
        assertThat(result,is(0.0));

    }
    @Test
    public void should_add_negative_values(){
        AddOperation addOperation= new AddOperation();
        Double result = addOperation.execute(new Double[]{-5.0,-6.0});
        assertThat(result,is(-11.0));
    }

}