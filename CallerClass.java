class LessThanOneException extends RuntimeException {
	public static final long serialVersionUID = 42L;

	public LessThanOneException(String message) {
		super(message);
	}
}

class FactorialClass {

	public static int factorial(int num) {
		if (num <= 0) {

			throw new LessThanOneException("Factorial Exception: Input number "
					+ num + " is equal to or less than zero.\n");
		}

		if (num == 1)
			return 1;

		return num * factorial(num - 1);
	}

}

public class CallerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.print("Factorial of 8 is: "
					+ FactorialClass.factorial(8) + "\n");
			System.out.println();

			System.out.print("Factorial of -8 is: "
					+ FactorialClass.factorial(-8) + "\n");

			// System.out.println("Factorial of 0 is: " +
			// FactorialClass.factorial(0));
			System.out.println();
		} catch (LessThanOneException e) {
			System.out.print(e.getMessage());
		}
	}
}
