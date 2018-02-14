import java.util.Scanner;

public class Exercise_2_2 {
	
	public static void main(String[] args) {
		// this program takes a user input temperature in degrees Fahrenheit and converts it 
		// to degree Celsius. the program then takes a user input degrees Celsius and converts
		// it to degrees Fahrenheit
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Fahrenheit Temperature: ");
		double degreesF = input.nextDouble();
		
		double degreesC = (degreesF - 32) * 5/9;
		
		System.out.printf("%.4fF is equivilant to %.4fC\n", degreesF, degreesC);
		
		System.out.println("Enter a Celsius temperature: ");
		degreesC = input.nextDouble();
		
		degreesF = (degreesC * 9/5) + 32;
		
		System.out.printf("%.4fC is equivilant to %.4fF\n", degreesC, degreesF);
		
	}

}
