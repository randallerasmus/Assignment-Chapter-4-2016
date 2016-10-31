package ObeyDesignPrinciples.DependencyInversionPrinciple;

/**
 * Created by Admin on 2016/03/25.
 */
public class Manager extends Person implements IAdministration{
    private double costPerKM;
    private int totalKMs;

    public Manager(Person p)
    {
        setName(p.getName());
        setSurname(p.getSurname());
        setHours(p.getHours());
        setRate(p.getRate());
    }

    public Manager(){

    }

    public Manager(Person p, double cost, int kms)
    {
        setName(p.getName());
        setSurname(p.getSurname());
        setHours(p.getHours());
        setRate(p.getRate());
        costPerKM = cost;
        totalKMs = kms;
    }


    public double getCostPerKM() {
        return costPerKM;
    }

    public void setCostPerKM(double costPerKM) {
        this.costPerKM = costPerKM;
    }

    public int getTotalKMs() {
        return totalKMs;
    }

    public void setTotalKMs(int totalKMs) {
        this.totalKMs = totalKMs;
    }

    public double calculateSalary(){
        return (costPerKM * totalKMs) + calculateBasic();
    }
}
