import java.util.Scanner;

public class AverageNumbers
{
	public static void main(String[] args)
	{
		// Make an int
		int[] numbers = new int[6]; //Once created, size can't change.  Declares size 6, does not initialize.


		// Make Scanner
		Scanner kb =  new Scanner(System.in);

		String input;
		int userNumber;

		// Now ask the user for the numbers
		for (int x = 0; x < numbers.length; x++)
		{
			System.out.println("Tell me the next number to average.");
			
			input = kb.nextLine();
			userNumber = Integer.parseInt(input);

			numbers[x] = userNumber;

			// number[x] = Integer.parseInt(kb.nextLine());
		}

		// Add the whole array together
		int total = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			total += numbers[i];
		}

		// TODO Divide by the total
		double average = (double) total / numbers.length;

		// Print the output
		System.out.println("The average is: " + average);

	}
}