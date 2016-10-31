package ObeyDesignPrinciples.OpenClosePrinciple;

/**
 * Created by User on 2016/10/25.
 */
public class Ticket {
    double price;
    char type;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
