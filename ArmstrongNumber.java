package assignmentweek1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 153, b = 0, remainder, number;
		number = a;
		while (number > 0) {
			remainder = number % 10;
			number = number / 10;
			b = (int) (b + Math.pow(remainder, 3));
		}
		if (b == a) {
			System.out.println("Number is armstrong");
		} else 
			System.out.println("Not an armstrng number");
		}
	}