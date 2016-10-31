package ObeyDesignPrinciples.SingleResponsibilityPrinciple;

/**
 * Created by User on 2016/10/25.
 */
public class adminDepatment extends administrationLogic{

    String name = "Jason", surname = "Hans";

    public void saveEmployeeDetails(){
        addEmployee(name, surname);
    }

    public void updateEmployee(String name, String surname)
    {
        updateName(name);
        updateSurname(surname);
    }
}
