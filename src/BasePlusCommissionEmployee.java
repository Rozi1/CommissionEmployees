public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;
    public BasePlusCommissionEmployee(String first, String last, String ssn, double gs, double cr, double bs)
    {
        super(first, last, ssn, gs, cr);
        setBaseSalary(bs);
    }
    public void setBaseSalary(double base)
    {
        if(base > 0.0 )
        {
            baseSalary = base;
        }
        else
            throw new IllegalArgumentException("base salary must be greater than 0");

    }
    public double getBaseSalary()
    {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format( "%s %s\n%s: %.2f", "base-salaried",
                super.toString(), "base salary", getBaseSalary() );
    }
}
