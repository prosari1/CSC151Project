

public class Policy3
{
	 private	String providerName;
    private static int policyCount;

	 /**
	  * No-Arg Constructor
	  */

	 public Policy3()
	 {
		  this.providerName = "";

	 }

	 /**
	  * Constructor that	accepts all	arguments to initialize	Policy object
	  */

	 public Policy3(String providerName)
	 {
		  this.providerName = providerName;
	 }

	 /**
	  * Getters	and Setters	for each	field
	  *
	  * Accesor	Methods (getters)	- method	that gets a	value	from a class's	field	but does	not change it.
	  * Mutator	Methods (setters)	- method	that stores	a value in a field or changes	the value of the field in some other way.
	  */

	 
	 public String	getProviderName()
	 {
		  return	providerName;
	 }

	 public void setProviderName(String	providerName)
	 {
		  this.providerName = providerName;
	 }
    
    /**
      *Add a static field that is used to keep track of the number of Policy objects that have been created.
      *
      */
    public Policy3()
    {
      policyCount++;
    }
    
    public int getPolicyCount()
    {
      return policyCount;
    }
    
    public String toString()
    {
      String str = "Provider Name" + providerName
                     + "\nPolicy Count: " + policyCount;
      return str;
    }


}