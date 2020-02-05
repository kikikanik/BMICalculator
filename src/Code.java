import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		//Create a BMI (Body Mass Index) calculator which prompts the user to enter their height (in feet and inches) and their weight (in pounds). The program should give the BMI results (number and category) in a user friendly way.
		//BMI = kg/m2
		//m = in/39.37
		//kg = lb/2.205

		//BMI	Weight Status
		//Below 19.0	Underweight
		//19 – 24.9	Normal or Healthy Weight
		//25.0 – 29.9	Overweight
		//30.0 – 39.9	Obese
		//40.0 and Above	Extremely Obese 
			double pounds = 0;
			double height = 0;
			
			Scanner in = new Scanner(System.in);
			
			int tryAgain = 1 ;
			while(tryAgain != 0) {
			System.out.println("BMI Calculator. Please enter your weight in pounds: ");
			pounds = in.nextDouble();
			double conversionForWeight = pounds/2.205; 
			System.out.println("Please enter your height in inches: ");
			height = in.nextDouble(); 
			double conversionForHeight = height/39.37; 
			
			if (Math.pow(conversionForWeight/39.37,  2) / conversionForHeight <= 18.99) { 
				System.out.println("Your BMI weight status is Underweight.");
			}
			else if (Math.pow(conversionForWeight/39.37,  2) / conversionForHeight <= 24.9) {
				System.out.println("Your BMI weight status is Normal. You are at a healthy weight.");
			}
			else if (Math.pow(conversionForWeight/39.37,  2) / conversionForHeight <= 25.0) {
				System.out.println("Your BMI weight status is Overweight.");
			}
			else if (Math.pow(conversionForWeight/39.37,  2) / conversionForHeight <= 30.0) {
			System.out.println("Your BMI weight status is Obese.");
			}
			else if (Math.pow(conversionForWeight/39.37,  2) / conversionForHeight >= 40.0) { 
			System.out.println("Your BMI weight status is Extremely Obese.");
			}
			System.out.println("To exit the BMI Calulator, Enter 0. To continue, enter any whole number: "); 
			tryAgain = in.nextInt(); 
			}
			in.close();
		}
	}