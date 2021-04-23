

public class PolicyHolder
{
	 private	String holderFirstName;
	 private	String holderLastName;
	 private	int holderAge;
	 private	String smokingStatus;
	 private	double holderHeight;
	 private	double holderWeight;

	 /**
	  * No-Arg Constructor
	  */

	 public PolicyHolder()
	 {
		  this.holderFirstName = "";
		  this.holderLastName =	"";
		  this.holderAge = 0;
		  this.smokingStatus	= "";
		  this.holderHeight = 0;
		  this.holderWeight = 0;
	 }
    
    public PolicyHolder(PolicyHolder obj2)
    {
      this.holderFirstName = obj2.holderFirstName;
		this.holderLastName =	obj2.holderLastName;
		this.holderAge = obj2.holderAge;
		this.smokingStatus = obj2.smokingStatus;
		this.holderHeight = obj2.holderHeight;
		this.holderWeight = obj2.holderWeight;
    }

	 /**
	  * Constructor that	accepts all	arguments to initialize	Policy object
	  */

	 public PolicyHolder(String holderFirstName, String holderLastName,	int holderAge,	String smokingStatus, double holderHeight, double holderWeight)
	 {
		  this.holderFirstName = holderFirstName;
		  this.holderLastName =	holderLastName;
		  this.holderAge = holderAge;
		  this.smokingStatus	= smokingStatus;
		  this.holderHeight = holderHeight;
		  this.holderWeight = holderWeight;
	 }

	 /**
	  * Getters	and Setters	for each	field
	  *
	  * Accesor	Methods (getters)	- method	that gets a	value	from a class's	field	but does	not change it.
	  * Mutator	Methods (setters)	- method	that stores	a value in a field or changes	the value of the field in some other way.
	  */

	 public String	getHolderFirstName()
	 {
		  return	holderFirstName;
	 }

	 public void setHolderFirstName(String	holderFirstName)
	 {
		  this.holderFirstName = holderFirstName;
	 }

	 public String	getHolderLastName()
	 {
		  return	holderLastName;
	 }

	 public void setHolderLastName(String holderLastName)
	 {
		  this.holderLastName =	holderLastName;
	 }

	 public int	getHolderAge()
	 {
		  return	holderAge;
	 }

	 public void setHolderAge(int	holderAge)
	 {
		  this.holderAge = holderAge;
	 }

	 public String	getSmokingStatus()
	 {
		  return	smokingStatus;
	 }

	 public void setSmokingStatus(String smokingStatus)
	 {
		  this.smokingStatus	= smokingStatus;
	 }

	 public double	getHolderHeight()
	 {
		  return	holderHeight;
	 }

	 public void setHolderHeight(double	holderHeight)
	 {
		  this.holderHeight = holderHeight;
	 }

	 public double	getHolderWeight()
	 {
		  return	holderWeight;
	 }

	 public void setHolderWeight(double	holderWeight)
	 {
		  this.holderWeight = holderWeight;
	 }

	 /**
	  * bmi of the	policyholder
	  * @return	the bmi = (Policyholder’s Weight	* 703	) / (Policyholder’s Height2 )
	  */

	 public double	calculateBMI ()
	 {
		  final double	CONVFACTOR = 703;

		  return	(holderWeight * CONVFACTOR) /	(holderHeight * holderHeight);
	 }
	 
   public String toString()
   {
      return String.format("Policyholder's First Name: " + holderFirstName + 
                           "\nPolicyholder's Last Name: " + holderLastName + 
                           "\nPolicyholder's Age: " + holderAge +
                           "\nPolicyholder's Smoking Status: " + smokingStatus +
                           "\nPolicyholder's Height: " + holderHeight + " inches" +
                           "\nPolicyholder's Weight: " + holderWeight + " pounds" +
                           "\nPolicyholder's BMI: %.2f" , calculateBMI());
   }
}
