package Composition;
/**
 * Created by User on 2016/10/25.
 */
public class Cab implements Freight {

    public int time;
    public double rate;
    public double distance;

    public double calculateCost()
    {
        return time*rate;
    }
}