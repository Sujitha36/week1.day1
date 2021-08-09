package assignmentweek1.day1;

public class Factorial {

	public static void main(String[] args) {

		int input = 5;

		int fact = 1;

		// (using loop concept)
		for (int i = 1; i <= input; i++) {

			fact = fact * i;
			// End of loop

		}
		// Print factorial (fact)
		System.out.println(fact);
	}
}
