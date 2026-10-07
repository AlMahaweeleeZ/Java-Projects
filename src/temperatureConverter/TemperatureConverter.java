package temperatureConverter;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double celsius;
		double fahrenheit;
		String answer;
		
		System.out.println("Would you like to convert from Celsius or Fahrenheit?");
		answer = scan.next();
		
		if (answer.equalsIgnoreCase("Celsius")) {
			
			System.out.println("Enter a temperature in Celius: ");
			celsius = scan.nextDouble();
			fahrenheit = ((celsius * 9/5) + 32);
			System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
			
		} else if (answer.equalsIgnoreCase("Fahrenheit")) {
			
			System.out.println("Enter a temperature in Fahrenheit: ");
			fahrenheit = scan.nextDouble();
			celsius = ((fahrenheit - 32) * 5/9);
			System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
			
		}
		scan.close();
	}

}