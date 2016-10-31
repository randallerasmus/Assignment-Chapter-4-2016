package ObeyDesignPrinciples.LiskovSubstitutionPrinciple;

/**
 * Created by User on 2016/10/25.
 */
public class AllAccess extends Ticket {
    @Override
    public double calculatePrice()
    {
        return this.getPrice() * this.getHours() * 0.75;
    }
}
