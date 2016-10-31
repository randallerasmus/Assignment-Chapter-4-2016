package Polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 2016/10/25.
 */
public class PolymorphismTest {

    private Shoe sneaker= new sneaker(), sandal= new Sandal();

    @Test
    public void testSneaker()
    {
        String newAction = "Running";
        sneaker.performAction();
        sneaker.setAction(newAction);
        String result = sneaker.performAction();
        Assert.assertEquals(result, newAction);
    }

    @Test
    public void testSandal()
    {
        String newAction = "strolling";
        sandal.performAction();
        sandal.setAction(newAction);
        String result = sandal.performAction();
        Assert.assertEquals(result, newAction);
    }

    @Test
    public void failTestSneaker()
    {
        String newAction = "Running";
        String oldAction = sneaker.performAction();
        sneaker.setAction(newAction);
        String result = sneaker.getAction();
        Assert.assertEquals(result, oldAction);
    }

    @Test
    public void failTestSandal()
    {
        String newAction = "strolling";
        String oldAction = sandal.performAction();
        sandal.setAction(newAction);
        String result = sandal.getAction();
        Assert.assertEquals(result, oldAction);
    }
}


}