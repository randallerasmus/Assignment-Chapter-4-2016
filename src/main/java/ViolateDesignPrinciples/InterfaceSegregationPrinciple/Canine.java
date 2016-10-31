package ViolateDesignPrinciples.InterfaceSegregationPrinciple;

/**
 * Created by User on 2016/10/25.
 */
public class Canine implements nonHumanSpecie {

    public void walk() {
        System.out.println("Walking. . .");
    }

    public void swim() {
        System.out.println("Can't swim, drowned");
    }

    public void dive() {
        System.out.println("Can't swim, drowned");
    }

    public void run() {
        System.out.println("Running. . .");
    }
}
