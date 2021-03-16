import java.util.*;
import java.io.*;

public class PolicyDemo2
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
   	   String holderFirstName;
   	   String holderLastName;
   	   int holderAge;
   	   String smokingStatus;
   	   double holderHeight;
   		double holderWeight;
         String fileInput = " ";


   		//Create an array list	to	store	objects.	The ArrayList will hold	Policy objects.
   		 ArrayList<Policy2>	insurance =	new ArrayList<Policy2>();
      
         /* Use a while loop	to	read the	file.	Use the hasNext()	method to determine whether
   	   the file has more data	to	be	read.	Use an "if statement" to determine the	end of the file and
   	   to consume	newline characters */
   	   while(inputFile.hasNext())
   	   { //open	loop
   	   	policyNumber = inputFile.nextLine();
   	   	providerName = inputFile.nextLine();
   	      holderFirstName = inputFile.nextLine();
   			holderLastName =	inputFile.nextLine();
            
            fileInput = inputFile.nextLine();//read the next line of the file as a String
   			holderAge = Integer.parseInt(fileInput);//convert the input into Integer
               			
            smokingStatus	= inputFile.nextLine();
            
            fileInput = inputFile.nextLine();//read the next line of the file as a String
   			holderHeight = Double.parseDouble(fileInput);//convert the input into Double
            
            fileInput = inputFile.nextLine();//read the next line of the file as a String
   			holderWeight = Double.parseDouble(fileInput); //convert the input into Double
            
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();//skip the blank line if we have not reached the end of the file
            }


   			/* Create	Policy2 objects using the policy	class	type.	Objects will be created	as	long as there are	records in the file to read.*/
   
   			Policy2 policy = new Policy2(policyNumber,	providerName, holderFirstName, holderLastName, holderAge, smokingStatus, holderHeight,	holderWeight);
   
   		   /* Add	Policy2 objects to the ArrayList	(Note: insurance is the	reference variable for the	ArrayList and policy	is	the
   		   reference variable for	the Policy2	objects)*/
   		   insurance.add(policy);
      
          }	//close while loop
		
         inputFile.close();//close the	file


         //use a	for loop	to	display the	output
   		for(int i =0; i <	insurance.size();	i++)
   		{
   		   System.out.println("Policy Number: " + insurance.get(i).getPolicyNumber());
   		   System.out.println("Provider Name: " + insurance.get(i).getProviderName());
   		   System.out.println("Policyholder’s First Name: " + insurance.get(i).getHolderFirstName());
   		   System.out.println("Policyholder’s Last Name: " +	insurance.get(i).getHolderLastName());
   		   System.out.println("Policyholder’s Age: " +	insurance.get(i).getHolderAge());
   		   System.out.println("Policyholder’s Smoking Status (will be “smoker” or “non-smoker”): " + insurance.get(i).getSmokingStatus());
   		   System.out.println("Policyholder’s Height (in inches): " +	insurance.get(i).getHolderHeight());
   		   System.out.println("Policyholder’s Weight (in pounds): " +	insurance.get(i).getHolderWeight());
   
   		   System.out.println();
   
   		} //end for loop
      }// end of try
      
      catch (IOException ex) 
      {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }//end of catch
      
	}// end of main
} // end	of	the class
