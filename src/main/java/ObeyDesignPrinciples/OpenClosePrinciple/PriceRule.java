package ObeyDesignPrinciples.OpenClosePrinciple;

/**
 * Created by User on 2016/10/25.
 */
public abstract class PriceRule {
    public boolean ruleApplies(Person p){
        return false;
    }
    public double calculatePrice(Person p){
        return p.ticketType.getPrice();
    }

}
