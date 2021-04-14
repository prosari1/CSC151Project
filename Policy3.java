

public class Policy3
{
    private	String policyNumber;
	 private	String providerName;
    private static int policyCount = 0;
    private PolicyHolder policyHolder;

	 /**
	  * No-Arg Constructor
	  */

	 public Policy3()
	 {
		  this.providerName = "";
        this.policyNumber = "";
        Policy3.policyCount++;
	 }

	 /**
	  * Constructor that	accepts all	arguments to initialize	Policy object
	  */

	 public Policy3(String providerName, String policyNumber, PolicyHolder policyHolder)
	 {
		  this.providerName = providerName;
        this.policyNumber = policyNumber;
        this.policyHolder = new PolicyHolder(policyHolder);
        Policy3.policyCount++;
	 }
    
    public Policy3(PolicyHolder policy, int policyCount)
    {
      this.policyCount = policyCount;
      this.policyHolder = new PolicyHolder(policyHolder);
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
    
    public int getPolicyCount()
    {
      return policyCount;
    }
        
    public PolicyHolder getPolicyHolder()
    {
      return policyHolder;
    }
    
    /** To string method 
    */
   
    public String toString()
    {
      String str = "There were " + policyCount + " Policy objects created.";
      return str;
    }


}