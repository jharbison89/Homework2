import java.util.Scanner;

public class Exercise_2_1 {
	
	public static void main(String[] args) {
		// this program takes a user input 5 digit number and 
		// returns the individual digits used and the sum of 
		// those digits
		
		Scanner input = new Scanner(System.in);
		
		int userNumber = 0;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		int fifthDigit;
		int sumDigit;
		
		while(userNumber > 99999 || userNumber < 10000) {
			
			System.out.print("Enter a 5-digit positive integer:");
			userNumber = input.nextInt();
			if(userNumber > 99999 || userNumber < 10000) {
				System.out.println("Invalid entry");
			}
		}
		
		firstDigit = userNumber / 10000;
		secondDigit = userNumber / 1000;
		secondDigit = secondDigit % 10;
		thirdDigit = userNumber / 100;
		thirdDigit = thirdDigit % 10;
		fourthDigit = userNumber / 10;
		fourthDigit = fourthDigit % 10;
		fifthDigit = userNumber % 10;
		
		sumDigit = firstDigit + secondDigit + thirdDigit + fourthDigit + fifthDigit;
		
		System.out.printf("The sum of digits is %d + %d + %d + %d + %d = %d\n", firstDigit, secondDigit, 
				thirdDigit, fourthDigit, fifthDigit, sumDigit);
		
		
	}

}
