package ViolateDesignPrinciples.DependencyInversionPrinciple;

/**
 * Created by User on 2016/10/25.
 */
public class AdminService {
    public double calculateSalary(Person p, String type)
    {
        if(type=="Manager")
            return new Manager(p).calculateSalary();
        else
           return new Worker(p).calculateSalary();
    }
}
