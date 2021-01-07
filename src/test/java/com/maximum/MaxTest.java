package com.maximum;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void givenIntegerMaxNumberAtFirstPosition_ReturnMaximumValueSame() {
        Findmax maxValue=new Findmax();
        Integer result =maxValue.testMaximum(9, 8, 3);
        Assert.assertSame(9, result);
    }

    @Test
    public void givenIntegerMaxNumberAtSecondPosition_ReturnMaximumValueSame() {
        Findmax maxValue = new Findmax();
        Integer result = maxValue.testMaximum(5,19,3);
        Assert.assertSame(19,result);
    }
    @Test
    public void givenIntegerMaxNumberAtThirdPosition_ReturnMaximumValueSame() {
        Findmax maxValue = new Findmax();
        Integer result = maxValue.testMaximum(16,19,35);
        Assert.assertSame(35,result);
    }
    @Test
    public void givenFloatMaxNumberAtFirstPosition_ReturnMaximumValueSame() {
        Findmax maxValue=new Findmax();
        Float result =maxValue.testMaximum(7.0f, 4.0f, 2.0f);
        Assert.assertEquals(7.0f, result,0);
    }

    @Test
    public void givenFloatMaxNumberAtSecondPosition_ReturnMaximumValueSame() {
        Findmax maxValue = new Findmax();
        Float result = maxValue.testMaximum(5.0f,9.0f,3.0f);
        Assert.assertEquals(9.0f,result,0);
    }
    @Test
    public void givenFloatMaxNumberAtThirdPosition_ReturnMaximumValueSame() {
        Findmax maxValue = new Findmax();
        Float result = maxValue.testMaximum(6.0f,7.0f,8.0f);
        Assert.assertEquals(8.0f,result,0);
    }
    @Test
    public void givenStringMaxNumberAtFirstPosition_ReturnMaximumValueSame() {
        Findmax maxValue=new Findmax();
        String result =maxValue.testMaximum("Xyz", "Pqr","Abc" );
        Assert.assertEquals("Xyz", result);
    }

    @Test
    public void givenStringMaxNumberAtSecondPosition_ReturnMaximumValueSame() {
        Findmax maxValue=new Findmax();
        String result =maxValue.testMaximum("Abc", "Xyz", "Pqr");
        Assert.assertEquals("Xyz", result);
    }

    @Test
    public void givenStringMaxNumberAtThirdPosition_ReturnMaximumValueSame() {
        Findmax maxValue=new Findmax();
        String result =maxValue.testMaximum("Abc", "Pqr", "Xyz");
        Assert.assertEquals("Xyz", result);
    }
}


