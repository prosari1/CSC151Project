

public class Policy
{
    private int policyNumber;
    private String providerName;
    private String holderFirstName;
    private String holderLastName;
    private int holderAge;
    private String smokingStatus;
    private double holderHeight;
    private double holderWeight;

    /**
     * No-Arg Constructor
     */

    public Policy()
    {
        this.policyNumber = 0;
        this.providerName = "";
        this.holderFirstName = "";
        this.holderLastName = "";
        this.holderAge = 0;
        this.smokingStatus = "";
        this.holderHeight = 0.0;
        this.holderWeight = 0.0;

    }

    /**
     * Constructor that accepts all arguments to initialize Policy object
     */

    public Policy(int policyNumber, String providerName, String holderFirstName, String holderLastName, int holderAge, String smokingStatus, double holderHeight, double holderWeight)
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.holderFirstName = holderFirstName;
        this.holderLastName = holderLastName;
        this.holderAge = holderAge;
        this.smokingStatus = smokingStatus;
        this.holderHeight = holderHeight;
        this.holderWeight = holderWeight;
    }

    /**
     * Getters and Setters for each field
     *
     * Accesor Methods (getters) - method that gets a value from a class's field but does not change it.
     * Mutator Methods (setters) - method that stores a value in a field or changes the value of the field in some other way.
     */

    public int getPolicyNumber()
    {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber)
    {
        this.policyNumber = policyNumber;
    }

    public String getProviderName()
    {
        return providerName;
    }

    public void setProviderName(String providerName)
    {
        this.providerName = providerName;
    }

    public String getHolderFirstName()
    {
        return holderFirstName;
    }

    public void setHolderFirstName(String holderFirstName)
    {
        this.holderFirstName = holderFirstName;
    }

    public String getHolderLastName()
    {
        return holderLastName;
    }

    public void setHolderLastName(String holderLastName)
    {
        this.holderLastName = holderLastName;
    }

    public int getHolderAge()
    {
        return holderAge;
    }

    public void setHolderAge(int holderAge)
    {
        this.holderAge = holderAge;
    }

    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    public void setSmokingStatus(String smokingStatus)
    {
        this.smokingStatus = smokingStatus;
    }

    public double getHolderHeight()
    {
        return holderHeight;
    }

    public void setHolderHeight(double holderHeight)
    {
        this.holderHeight = holderHeight;
    }

    public double getHolderWeight()
    {
        return holderWeight;
    }

    public void setHolderWeight(double holderWeight)
    {
        this.holderWeight = holderWeight;
    }

    /**
     * bmi of the policyholder
     * @return the bmi = (Policyholder’s Weight * 703 ) / (Policyholder’s Height2 )
     */

    public double calculateBMI ()
    {
        double bmi = 0.0;

        bmi = (holderWeight * 703) / (Math.pow(holderHeight, 2));
        return  bmi;
    }

    /**
     * method that calculates and returns the price of the insurance policy
     * The Insurance Policy has a base fee of $600
     * If the Policyholder is over 50 years old, there is an additional fee of $75
     * If the Policyholder is a smoker, there is an additional fee of $100
     * If the Policyholder has a BMI of over 35, there is an additional fee calculated as follows:
     * Additional Fee = ( BMI – 35 ) * 20
     */

    public double calculateInsurancePrice ()
    {
        final double BASE_FEE = 600.0;
        final double AGE_FEE = 75.0;
        final double SMOKER_FEE = 100.0;
        double insurancePrice = 0.0;
        double bmi = calculateBMI(); //passing value bmi calculate in the method

        if (holderAge >= 50)
        {
            insurancePrice = AGE_FEE;
        }
        else if (smokingStatus.equalsIgnoreCase("smoker"))
        {
            insurancePrice = SMOKER_FEE;
        }
        else if (bmi >= 35)
        {
            insurancePrice = (( bmi - 35 ) * 20);
        }

        return insurancePrice + BASE_FEE;
    }

}
