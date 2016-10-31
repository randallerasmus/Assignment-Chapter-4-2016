package ViolateDesignPrinciples.InterfaceSegregationPrinciple;

/**
 * Created by User on 2016/10/25.
 */
public class leviathan implements nonHumanSpecie {

    public void walk() {
        System.out.println("Can't Walk");
    }

    public void swim() {
        System.out.println("Swimming. . .");
    }

    public void dive() {
        System.out.println("Dove.");
    }

    public void run() {
        System.out.println("Can't Run");
    }
}
