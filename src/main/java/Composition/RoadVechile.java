package Composition;
/**
 * Created by User on 2016/10/25.
 */

public class RoadVechile implements Freight {

    public int time = 0;
    public double distance = 0.0;
    public double rate = 0.0;

   public double calculateCost() {
        return rate*distance;
    }

}
