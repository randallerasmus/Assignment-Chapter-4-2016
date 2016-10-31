package Encapsulation;
/**
 * Created by User on 2016/10/25.
 */

public class ownBluePrint {

    private double interestRate = 0.14;
    private String item = "";
    private double itemWithInterest = 0;
    private double totalWithInterest = 0;
    private int amount = 0;


    public ownBluePrint(String item)
    {
        this.item = item;
    }
    
    public double calculatePricePerItem(double price)
    {
        itemWithInterest = price*(1+interestRate);
        return itemWithInterest;
    }

    public double calculateTotalAmount(double price, int amount)
    {
        this.amount = amount;
        return price*(1+interestRate)*amount;
    }

    public String displayTotal()
    {
        return item + " will cost R" + itemWithInterest + " at an interest rate of "  + interestRate*100 + "%";
    }

    public String displaySingleItem()
    {
        return  amount + item + "(s) will cost R" + totalWithInterest + " at an interest rate of "  + interestRate*100 + "%";
    }

}
