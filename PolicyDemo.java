import java.util.*;
import java.io.*;

public class PolicyDemo3
{

	public static void main	(String[] args) 
	{
      try 
      {
	   
         /*Create	an	instance	of	the File	class. Pass	the string "PolicyInformation.txt" to the	constructor.*/
   	   File file =	new File("PolicyInformation.txt");

         //Scanner class to read	input	from user
         Scanner inputFile	= new	Scanner(file);

         //declare variables
         String policyNumber;
         String providerName;
   	   String firstName;
   	   String lastName;
   	   int age;
   	   String smokingStatus;
   	   double height;
   		double weight;
         String fileInput = " ";

   		//Create an array list	to	store	objects.	The ArrayList will hold	Policy objects.
   		ArrayList<Policy3> insurance = new ArrayList<Policy3>();
      
         /* Use a while loop	to	read the	file.	Use the hasNext()	method to determine whether
   	   the file has more data	to	be	read.	Use an "if statement" to determine the	end of the file and
   	   to consume	newline characters */
   	   while(inputFile.hasNext())
   	   { //open	loop
   	   	policyNumber = inputFile.nextLine();
   	   	providerName = inputFile.nextLine();
   	      firstName = inputFile.nextLine();
   			lastName =	inputFile.nextLine();
            
            fileInput = inputFile.nextLine();//read the next line of the file as a String
   			age = Integer.parseInt(fileInput);//convert the input into Integer
               			
            smokingStatus	= inputFile.nextLine();
            
            fileInput = inputFile.nextLine();//read the next line of the file as a String
   			height = Double.parseDouble(fileInput);//convert the input into Double
            
            fileInput = inputFile.nextLine();//read the next line of the file as a String
   			weight = Double.parseDouble(fileInput); //convert the input into Double
            
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();//skip the blank line if we have not reached the end of the file
            }

            PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
            Policy3 policy = new Policy3(policyNumber, providerName, policyHolder);
            
   			//create a Policy object and add it to our ArrayList
            insurance.add(policy);
               
          }	//close while loop
		
         inputFile.close();//close the	file

         int totalSmokers = 0;
         int totalNonSmokers = 0;
         //use a	for loop	to	display the	output
   		for(int i =0; i <	insurance.size();	i++)
   		{
            PolicyHolder currentPolicyHolder = new PolicyHolder(insurance.get(i).getPolicyHolder());
   		   System.out.println("Policy Number: " + insurance.get(i).getPolicyNumber());
   		   System.out.println("Provider Name: " + insurance.get(i).getProviderName());
   		   System.out.println("Policyholder’s First Name: " + currentPolicyHolder.getHolderFirstName());
   		   System.out.println("Policyholder’s Last Name: " +	currentPolicyHolder.getHolderLastName());
   		   System.out.println("Policyholder’s Age: " +	currentPolicyHolder.getHolderAge());
   		   System.out.println("Policyholder’s Smoking Status (will be “smoker” or “non-smoker”): " + currentPolicyHolder.getSmokingStatus());
   		   System.out.println("Policyholder’s Height (in inches): " +	currentPolicyHolder.getHolderHeight() + " inches");
   		   System.out.println("Policyholder’s Weight (in pounds): " +	currentPolicyHolder.getHolderWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f\n", currentPolicyHolder.calculateBMI());
            System.out.printf("Policy Price: $%.2f\n", currentPolicyHolder.calculateInsurancePrice());
   
   		   System.out.println();
            
           
            if (currentPolicyHolder.getSmokingStatus().equalsIgnoreCase("smoker")) 
            {
               totalSmokers += 1;
            } 
            else 
            {
               totalNonSmokers += 1;
            }

            if (i == insurance.size() - 1) 
            {
               System.out.println(insurance.get(i));   //implicit call for toString() at the end
               System.out.println("The number of policies with a smoker is: " +  totalSmokers);
               System.out.println("The number of policies with a non-smoker is: " + totalNonSmokers);
            }
   		} //end for loop
         
      }// end of try
      
      catch (IOException ex) 
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }//end of catch
      
	}// end of main
} // end	of	the class
