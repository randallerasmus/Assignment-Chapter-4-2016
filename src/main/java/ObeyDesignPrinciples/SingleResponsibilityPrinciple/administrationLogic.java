package ObeyDesignPrinciples.SingleResponsibilityPrinciple;

/**
 * Created by User on 2016/10/25.
 */
public abstract class administrationLogic {
    public String employeeName, employeeSurname;

    public void addEmployee(String name, String surname)
    {
        this.employeeName = name;
        this.employeeSurname = surname;
    }

    public void updateName(String newName){
        employeeName = newName;
    }

    public void updateSurname(String surname)
    {
        employeeSurname = surname;
    }
}
