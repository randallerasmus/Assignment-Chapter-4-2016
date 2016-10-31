package ObeyDesignPrinciples.SingleResponsibilityPrinciple;

/**
 * Created by User on 2016/10/25.
 */
public abstract class accountingLogic {

    public double ratePerHour;

    public double calculatePayment(int daysWorked)
    {
        return ratePerHour * daysWorked;
    }

    public void promotion(double newRate)
    {
        ratePerHour = newRate;

    }
}
