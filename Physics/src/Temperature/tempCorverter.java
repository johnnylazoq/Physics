package Temperature;

import java.util.Scanner;

public class tempCorverter {

	public static void main(String[] args) {
			
		final int BASE = 32;
		final double CONVERSION_FACTOR = 9.0/5.0;
		int celsiusTemperature;
		double fahrenheitTemperature;
			
			
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Enter a Celsius Temperature: ");
			
		celsiusTemperature = scan.nextInt();
			
		fahrenheitTemperature = celsiusTemperature * CONVERSION_FACTOR + BASE;  // formula for conversion
			
		System.out.println("Celsius Temperature: " + celsiusTemperature);
		System.out.println("Fahrenheit Equivalent Temperature: " + fahrenheitTemperature);

	}

	
}
