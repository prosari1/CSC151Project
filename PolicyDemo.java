import java.util.Scanner;

public class PolicyDemo
{
    public static void main (String[] args)
    {
        //Scanner class to read input from user
        Scanner userInput = new Scanner(System.in);

        /**
         * Create object to Policy class passing the userInput
         */

        Policy policy = new Policy();

        //Display questions and pass the input to Policy class

        System.out.print("Please enter the Policy Number: ");
        policy.setPolicyNumber(userInput.nextInt());

        System.out.print("Please enter the Provider Name: ");
        userInput.nextLine();//clear newline left in buffer
        policy.setProviderName(userInput.nextLine());

        System.out.print("Please enter the Policyholder’s First Name: ");
        policy.setHolderFirstName(userInput.nextLine());

        System.out.print("Please enter the Policyholder’s Last Name: ");
        policy.setHolderLastName(userInput.nextLine());

        System.out.print("Please enter the Policyholder’s Age: ");
        policy.setHolderAge(userInput.nextInt());

        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        userInput.nextLine();//clear newline left in buffer
        policy.setSmokingStatus(userInput.nextLine());

        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        policy.setHolderHeight(userInput.nextDouble());

        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        policy.setHolderWeight(userInput.nextDouble());

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
        System.out.printf("Policyholder’s BMI: %,.2f", policy.calculateBMI());
        System.out.printf("\nPolicy Price: $%,.2f", policy.calculateInsurancePrice());
    }
}
