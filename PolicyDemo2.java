import java.util.Scanner;

public class PolicyDemo2
{
    public static void main (String[] args)
    {
        //declare variables
        String policyNumber;
        String providerName;
        String holderFirstName;
        String holderLastName;
        int holderAge;
        String smokingStatus;
        double holderHeight;
        double holderWeight;

        //Scanner class to read input from user
        Scanner userInput = new Scanner(System.in);

        //prompt the user to enter information about the Policy
        System.out.print("Please enter the Policy Number: ");
        policyNumber = userInput.nextLine();

        System.out.print("Please enter the Provider Name: ");
        providerName = userInput.nextLine();

        System.out.print("Please enter the Policyholder's First Name: ");
        holderFirstName = userInput.nextLine();

        System.out.print("Please enter the Policyholder's Last Name: ");
        holderLastName = userInput.nextLine();

        System.out.print("Please enter the Policyholder's Age: ");
        holderAge = userInput.nextInt();
        userInput.nextLine();

        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        smokingStatus = userInput.nextLine();

        System.out.print("Please enter the Policyholder's Height (in inches): ");
        holderHeight = userInput.nextDouble();

        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        holderWeight = userInput.nextDouble();

        //create a Policy object
        Policy2 policy = new Policy2(policyNumber, providerName, holderFirstName, holderLastName, holderAge, smokingStatus, holderHeight, holderWeight);

        //Questions end here

        System.out.println();

        //Displaying objects from Policy class

        System.out.println("Policy number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder’s First Name: " + policy.getHolderFirstName());
        System.out.println("Policyholder’s Last Name: " + policy.getHolderLastName());
        System.out.println("Policyholder’s Age: " + policy.getHolderAge());
        System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder’s Height: " + policy.getHolderHeight());
        System.out.println("Policyholder’s Weight: " + policy.getHolderWeight());
        System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
        System.out.printf("Policy Price: $%.2f\n", policy.calculateInsurancePrice());
    }
}
