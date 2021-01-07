package com.maximum;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void givenMaxNumberAtFirstPosition_ReturnMaximumValueSame() {
        Findmax maxValue=new Findmax();
        Integer result =maxValue.max(9, 8, 3);
        Assert.assertSame(9, result);
    }

    @Test
    public void givenMaxNumberAtSecondPosition_ReturnMaximumValueSame() {
        Findmax maxValue = new Findmax();
        Integer result = maxValue.max(5,19,3);
        Assert.assertSame(19,result);
    }
}


