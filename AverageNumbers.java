public class AverageNumbers
{
	public static void main(String[] args)
	{
		// Make an int
		int[] numbers = {0, -5, 3, 9, 8, 2};

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