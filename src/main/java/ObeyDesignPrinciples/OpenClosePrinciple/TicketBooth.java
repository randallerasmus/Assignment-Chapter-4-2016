package ObeyDesignPrinciples.OpenClosePrinciple;

import java.util.List;

/**
 * Created by User on 2016/10/25.
 */
public class TicketBooth {
    public double calculateTotal(List<PriceRule> rules, List<Person> people)
    {
        double total=0.0;
        for(Person p :people)
        {
            for(PriceRule r: rules)
                if(r.ruleApplies(p))
                    total = r.calculatePrice(p);
        }
        return total;
    }
}
