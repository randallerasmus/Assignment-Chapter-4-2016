package ViolateDesignPrinciples.SingleResponsibilityPrinciple;

/**
 * Created by User on 2016/10/25.
 */
public class incorrectPrincipleMethods {
    public String employeeName, employeeSurname;
    public double ratePerHour;

    public double calculatePayment(int daysWorked)
    {
        return ratePerHour * daysWorked;
    }

    public void addEmployee(String name, String surname)
    {
        this.employeeName = name;
        this.employeeSurname = surname;
    }

    public void promotion(double newRate)
    {
        ratePerHour = newRate;
    }

    public void updateName(String newName){
        employeeName = newName;
    }

    public void updateSurname(String surname)
    {
        employeeSurname = surname;
    }

}
