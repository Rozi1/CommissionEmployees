public class CommissionEmployee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String first, String last, String ssn, double gs, double cr)
    {
        setFirstName(first);
        setLastName(last);
        setSocialSecurityNumber(ssn);
        setGrossSales(gs);
        setCommissionRate(cr);
    }
    public void setFirstName(String first)
    {
        firstName = first;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setLastName(String last)
    {
        lastName = last;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setSocialSecurityNumber(String ssn)
    {
        socialSecurityNumber = ssn;
    }
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }
    public void setGrossSales(double gs)
    {
        if(gs > 0.0)
        grossSales = gs;
        else
            throw new IllegalArgumentException("Gross sales cannot be 0.0");
    }
    public double getGrossSales()
    {
        return grossSales;
    }
    public void setCommissionRate(double cr)
    {
        if(cr > 0.0 && cr < 1.0)
        commissionRate = cr;
        else
            throw new IllegalArgumentException("Commission rate must be in range of 0.1 - 0.99");
    }
    public double getCommissionRate()
    {
        return commissionRate;
    }
    public double earnings()
    {
        return getCommissionRate() * getGrossSales();
    }

    public String toString()
    {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f ","Commission Employee", getFirstName(),
                getLastName(), "Social Security Number", getSocialSecurityNumber(), "Gross Sales", getGrossSales(), "Commission rate", getCommissionRate());
    }


}
