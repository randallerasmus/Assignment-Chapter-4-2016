package ViolateDesignPrinciples.OpenClosePrinciple;

import java.util.List;

/**
 * Created by User on 2016/10/25.
 */
public class TicketBooth {
    public double calculateTotal(List<Person> group)
    {
        double total = 0.0, price = 0.0;
        for (Person p: group) {

            if(p.ticketType =='A')
                price = 50;
            else if(p.ticketType == 'V')
                price = 10;
            else if(p.ticketType == 'R')
                price = 35;

            if(p.age<13)
                price *= 0.5;
            else if(p.age > 65)
                price *= 0.75;

            total += price;
        }
        return total;
    }
}
