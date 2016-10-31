package Polymorphism;

/**
 * Created by User on 2016/10/25.
 */
public class Shoe {
    int size ;
    String action = "Standing";

    public Shoe()
    {

    }

    public void setAction (String action)
    {
        this.action = action;
    }

    public String getAction()
    {
        return action;
    }

    public String performAction()
    {
        System.out.println("The man is " + action);
        return action;
    }
}
