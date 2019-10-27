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
     * Call another method -SayHelloWorld-
     * <p>
     * 
     * @param args a string array containing all the arguments from the command line
     */

    public static void main(String[] args) {
	SayHelloWorld(args);
	// System.console().readLine();
    }

    /**
     * This method prints "Hello World" to the console
     * <p>
     * This method loops a number (Max) times
     *
     * @param args a string array containing all the arguments from the command line
     * 
     * @return value indicating number of times the method looped
     */

    public static int SayHelloWorld(String[] args) throws NumberFormatException, NullPointerException, ArrayIndexOutOfBoundsException {

	Integer i = 1;
	Integer Max = 3;

	int firstArg;
	try {
	    // firstArg = Integer.parseInt(args[0]);
	    firstArg = Integer.parseUnsignedInt(args[0]);

	    System.err.println("VALID: argument <" + args[0] + "> used");
	    System.err.println("  ");

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

	} catch (ArrayIndexOutOfBoundsException e) {
	    System.err.println("NO ARGUMENT: Argument must be a Positive Integer");
	    System.err.println("  Using DEFAULT value: " + Max + " ");
	    System.err.println("  ");

	    firstArg = Max;

	    // throw new ArrayIndexOutOfBoundsException("NO ARGUMENT: Argument must be a Positive
	    // Integer");

	} catch (Exception e) {

		if (args.length == 0) {
			System.err.println("ERROR: argument <" + "missing"  + "> caused an " + e + " error!");
	    } else {
			System.err.println("ERROR: argument <" + args[0] + "> caused an " + e + " error!");
	    }
	    	
	    System.err.println("  Using DEFAULT value: " + Max + " ");
	    System.err.println("  ");

	    firstArg = Max;
	}

	Max = firstArg;

	while (i <= Max) {
	    System.out.println("Hello World ! " + i++ + " of " + Max);
	}
	System.out.println(" ");

	return --i;
    }
}
