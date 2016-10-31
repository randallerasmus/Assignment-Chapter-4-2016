package Encapsulation;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 2016/10/25.
 */
public class applicationClassTest {

    implementationClass _imp;

    public applicationClassTest() {
        _imp = new implementationClass(new myClass("food"), 13, 5.75);
    }

    @Test
    public void testSingleCost()
    {
        double expectedValue = 6.500001;
        Assert.assertEquals(_imp.calculateSignleItem(), expectedValue);
    }


    @Test
    public void failTestSingleCost()
    {
        double failValue = 24;
        Assert.assertEquals(_imp.calculateSignleItem(), failValue);
    }

    @Test
    public void testTotalCost()
    {
        double expectedValue = 25.398;
        Assert.assertEquals(_imp.calculateTotalCost(), expectedValue);
    }

    @Test
    public void failTestTotalCost()
    {
        double failValue = 5;
        Assert.assertEquals(_imp.calculateTotalCost(), failValue);
    }


}