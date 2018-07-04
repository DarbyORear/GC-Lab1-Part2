package lab1part2package;

//Import classes needed.
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Create a class and a main method.
public class GC_Lab1_Part2 {
	public static void main(String[] args) {

		//Prompt the user to enter a date in a specific format, and set up scanner to accept user input.
		System.out.println("Please enter a date in the format MM-dd-yyyy: ");
		Scanner scnr = new Scanner(System.in);
		String dateOne = scnr.nextLine();
		
		//Initialize DateTimeFormatter and specify date pattern of expected input.
		//Convert string input from user to LocalDate, so the computer can calculate differences in time between the two dates.
		//Calculations won't work if input is a string.
		DateTimeFormatter formatterDateOne = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		LocalDate usableDateOne = LocalDate.parse(dateOne, formatterDateOne);
		System.out.println();
		
		//Prompt user to input a second date and repeat previous steps.
		//Close scanner since we are done accepting input.
		System.out.println("Please enter a second date in the format MM-dd-yyyy: ");
		String dateTwo = scnr.nextLine();
		scnr.close();
		DateTimeFormatter formatterDateTwo = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		LocalDate usableDateTwo = LocalDate.parse(dateTwo, formatterDateTwo);
		System.out.println();

		//Calculate length of time in years, months, and days between LocalDate one and LocalDate two.
		Period timeBetween = Period.between(usableDateOne, usableDateTwo);
		
		//Output difference in dates. Use Math.abs to ensure the output is positive even if second date is earlier than first.
		System.out.println("There are " + Math.abs(timeBetween.getYears()) + " years, "
				+ Math.abs(timeBetween.getMonths()) + " months, " + Math.abs(timeBetween.getDays()) + " days between "
				+ dateOne + " and " + dateTwo + ".");
	}
}



