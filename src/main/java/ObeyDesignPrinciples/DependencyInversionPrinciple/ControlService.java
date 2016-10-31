package ObeyDesignPrinciples.DependencyInversionPrinciple;

/**
 * Created by User on 2016/10/25.
 */
public class ControlService {
    public double calculateSalary(IAdministration employee)
    {
        return employee.calculateSalary();
    }
}
