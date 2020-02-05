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
			double feet = 0;
			double inches = 0;
			double height = 0;
			
			Scanner in = new Scanner(System.in);
			
			int tryAgain = 1 ;
			while(tryAgain != 0) {
			System.out.println("Body Mass Index Calculator. Please enter your weight in pounds: ");
			pounds = in.nextDouble(); 
			System.out.println("Please enter your height in whole feet here: ");
			feet = in.nextDouble(); 
			System.out.println("Please enter the remainder of your height in inches here: ");
			inches = in.nextDouble();
			
			if (pounds*703 / Math.pow((feet*12 + inches), 2) <= 18.99) { 
				System.out.println("Your BMI weight status is Underweight.");
			}
			else if (pounds*703 / Math.pow((feet*12 + inches), 2) <= 24.9) {
				System.out.println("Your BMI weight status is Normal. You are at a healthy weight.");
			}
			else if (pounds*703 / Math.pow((feet*12 + inches), 2) <= 25.0) {
				System.out.println("Your BMI weight status is Overweight.");
			}
			else if (pounds*703 / Math.pow((feet*12 + inches), 2) <= 30.0) {
			System.out.println("Your BMI weight status is Obese.");
			}
			else if (pounds*703 / Math.pow((feet*12 + inches), 2) >= 40.0) { 
			System.out.println("Your BMI weight status is Extremely Obese.");
			}
			System.out.println("To exit the BMI Calulator, Enter 0. To continue, enter any whole number: "); 
			tryAgain = in.nextInt(); 
			}
			in.close();
		}
	}