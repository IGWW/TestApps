package HelloWorld;

/**
 * This class covers "Hello World"
 * <p>
 * Only has the main method
 * 
 */

public class HelloWorld {

	/**
	 * Starts the main application
	 * <p>
	 * This method prints "Hello World" to the console
	 * <p>
	 * This method loops a number (Max) times
	 *
	 * @param args a string array containing all the arguments from the command line
	 */

	public static void main(String[] args) {
		SayHelloWorld(args);
	}

	public static int SayHelloWorld(String[] args) throws NumberFormatException, NullPointerException {

		Integer i = 1;
		Integer Max = 3;

		// if (args.length > 0) {
		int firstArg;
		try {
			// firstArg = Integer.parseInt(args[0]);
			firstArg = Integer.parseUnsignedInt(args[0]);

		} catch (NumberFormatException e) {
			System.err.println("Argument <" + args[0] + "> must be a Positive Integer");
			System.err.println("  Using DEFAULT value: " + Max + " ");
			System.err.println("  ");

			firstArg = Max;

			// throw new NumberFormatException("Argument <" + args[0] + "> must be a
			// Positive Integer");

		} catch (NullPointerException e) {
			System.err.println("MISSING ARGUMENT: Argument must be a Positive Integer");
			System.err.println("  Using DEFAULT value: " + Max + " ");
			System.err.println("  ");

			firstArg = Max;

			// throw new NullPointerException("MISSING ARGUMENT: Argument must be a Positive
			// Integer");
		}
		Max = firstArg;
		// }

		while (i <= Max) {
			System.out.println("Hello World ! " + i++ + " of " + Max);
		}
		System.out.println(" ");

		return --i;
	}
}
