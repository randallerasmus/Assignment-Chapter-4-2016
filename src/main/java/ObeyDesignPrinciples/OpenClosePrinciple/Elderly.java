package ObeyDesignPrinciples.OpenClosePrinciple;

/**
 * Created by User on 2016/10/25.
 */
public class Elderly extends PriceRule {


    public boolean ruleApplies(Person p) {
        return p.age > 65;
    }

    public double calculatePrice(Person p) {
        return p.ticketType.getPrice()*0.75;
    }
}
