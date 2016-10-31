package ViolateDesignPrinciples.LiskovSubstitutionPrinciple;

/**
 * Created by User on 2016/10/25.
 */
public class ticketBooth {
    public double calculatePrice(Ticket t)
    {
        if(t.type == 'A')
            return t.getPrice() * t.getHours() * 0.75;
        else if(t.type == 'R')
            return t.getPrice() * t.getHours() * 0.5;
        else if (t.type == 'V')
            return t.getHours() * t.getPrice();
        else
            return t.getPrice();
    }
}
