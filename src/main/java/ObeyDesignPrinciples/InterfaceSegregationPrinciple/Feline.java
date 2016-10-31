package ObeyDesignPrinciples.InterfaceSegregationPrinciple;

/**
 * Created by User on 2016/10/25.
 */
public class Feline implements LandAnimal {

    public void walk() {
        System.out.println("Walking. . .");
    }

    public void run() {
        System.out.println("Running. . .");
    }
}
