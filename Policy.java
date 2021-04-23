

public class Policy3
{
    private	String policyNumber;
	 private	String providerName;
    private PolicyHolder pH;
    
    private static int policyCount = 0; //static field to keep track of the number of policy

	 /**
	  * No-Arg Constructor
	  */

	 public Policy3()
	 {
		  this.providerName = "";
        this.policyNumber = "";
        this.pH = new PolicyHolder(); //initialize the policy holder field 
        Policy3.policyCount++;
	 }

	 /**
	  * Constructor that	accepts all	arguments to initialize	Policy object
	  */

	 public Policy3(String providerName, String policyNumber, PolicyHolder pH)
	 {
		  this.providerName = providerName;
        this.policyNumber = policyNumber;
        this.pH = new PolicyHolder(pH);//create a "deep copy" using the PolicyHolder's copy constructor
        Policy3.policyCount++;
	 }
    
    public Policy3(PolicyHolder pH, int policyCount)
    {
      this.policyCount = policyCount;
      this.pH = new PolicyHolder(pH);
      Policy3.policyCount++;
    }

	 /**
    
	  * Getters	and Setters	for each	field
	  *
	  * Accesor	Methods (getters)	- method	that gets a	value	from a class's	field	but does	not change it.
	  * Mutator	Methods (setters)	- method	that stores	a value in a field or changes	the value of the field in some other way.
	  */
    public String	getPolicyNumber()
	 {
		  return	policyNumber;
	 }

	 public void setPolicyNumber(String	policyNumber)
	 {
		  this.policyNumber = policyNumber;
	 }
	 
	 public String	getProviderName()
	 {
		  return	providerName;
	 }

	 public void setProviderName(String	providerName)
	 {
		  this.providerName = providerName;
	 }
    
    public static int getPolicyCount()
    {
      return policyCount;
    }
        
    /**
    @return The PolicyHolder for the policy
    */
    
    public PolicyHolder getPolicyHolder()
    {
      return new PolicyHolder(pH);//return a copy of the PolicyHolder for the policy using the Copy Constructor
    }
    
    /**
	  * method that calculates	and returns	the price of the insurance	policy
	  * The Insurance	Policy has a base	fee of $600
	  * If the Policyholder	is	over 50 years old, there is an additional	fee of $75
	  * If the Policyholder	is	a smoker, there is an additional	fee of $100
	  * If the Policyholder	has a	BMI of over	35, there is an additional	fee calculated	as	follows:
	  * Additional	Fee =	( BMI	– 35 ) *	20
	  *
	  * @return	insurancePrice
	  */

	 public double	calculateInsurancePrice	()
	 {
		  final double	BASE_FEE	= 600.0;
		  final double	AGE_FEE = 75.0;
		  final double	SMOKER_FEE = 100.0;
		  final double	ADDITIONAL_FEE_PER_BMI = 20.0;

		  final int	AGE_THRESHOLD = 50;
		  final int	BMI_THRESHOLD = 35;

		  double	insurancePrice	= BASE_FEE;

		  if (pH.getHolderAge() >= AGE_THRESHOLD)//over 50 years
		  {
				insurancePrice	+=	AGE_FEE;	//75
		  }
		  if (pH.getSmokingStatus().equalsIgnoreCase("smoker"))
		  {
				insurancePrice	+=	SMOKER_FEE;	//100
		  }
		  if (pH.calculateBMI()	>=	BMI_THRESHOLD)	 //BMI over	35
		  {
				insurancePrice	+=	((	pH.calculateBMI()	- BMI_THRESHOLD )	* ADDITIONAL_FEE_PER_BMI);	//additional BMI fee	- 20
		  }

		  return	insurancePrice;
	 }
    
   /**
   @return A String that describes the Policy
   */
   public String toString()
   {
      return String.format("Policy Number: " + policyNumber +
                           "\nProvider Name: " + providerName +
                           "\n" + pH + //implicitly calling the PolicyHolder's toString() method
                           "\nPolicy Price: $%.2f", calculateInsurancePrice());
   }


}