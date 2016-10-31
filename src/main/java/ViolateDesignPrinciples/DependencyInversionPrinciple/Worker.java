package ViolateDesignPrinciples.DependencyInversionPrinciple;

/**
 * Created by User on 2016/10/25.
 */
public class Worker extends Person {
    private double overTimeRate, overTimeHours;

    public Worker(Person p)
    {
        setName(p.getName());
        setSurname(p.getSurname());
        setHours(p.getHours());
        setRate(p.getRate());
    }

    public Worker(){

    }

    public Worker(Person p, double overTime, double hours)
    {
        setName(p.getName());
        setSurname(p.getSurname());
        setHours(p.getHours());
        setRate(p.getRate());
        setoverTimeHours(hours);
        setOverTimeRate(overTime);
    }

    public double getOverTimeRate() {
        return overTimeRate;
    }

    public void setOverTimeRate(double overTimeRate) {
        this.overTimeRate = overTimeRate;
    }

    public double getoverTimeHours() {
        return overTimeHours;
    }

    public void setoverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public double calculateSalary()
    {
        return (overTimeHours*overTimeRate) + calculateBasic();
    }
}
