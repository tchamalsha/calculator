package com.kelaniya.uni.v5.operations;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class DivOperationTest {
    @Test
    public void should_devide_positive_values() throws InvalidOperationEception {
        DivOperation divOperation = new DivOperation();
        Double result = divOperation.execute(new Double[]{6.0,3.0});

        assertThat(result,is(2.0));

    }

    @Test
    public void should_not_devide_by_zero() throws InvalidOperationEception {
        DivOperation divOperation = new DivOperation();
        Double result = divOperation.execute(new Double[]{6.0,0.0});

    }
}