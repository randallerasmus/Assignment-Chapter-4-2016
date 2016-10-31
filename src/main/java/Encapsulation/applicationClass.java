package Encapsulation;
/**
 * Created by User on 2016/10/25.
 */

public class applicationClass {
    private int amount = 50;
    private double price = 31.74;
    private ownBluePrint _methods;

    public applicationClass(ownBluePrint methods, int amount, double price)
    {
        this._methods = methods;
        this.price = price;
        this.amount = amount;
    }

    public double calculateSignleItem()
    {
        return _methods.calculatePricePerItem(price);
    }

    public double calculateTotalCost()
    {
        return _methods.calculateTotalAmount(price, amount);
    }

    public void displayData()
    {
        System.out.println(_methods.displaySingleItem());
        System.out.println("\n\n");
        System.out.println(_methods.displayTotal());
    }
}
