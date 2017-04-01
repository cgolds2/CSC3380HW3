//Created by Connor Goldsmith
public class HW3_Main {
	public static void main(String[] args) {

		boolean assertsEnabled = false;
		assert assertsEnabled = true;
		// if assertions are enabled, assertsEnabled will be set to true, if not
		// the value will stay false
		if (!assertsEnabled) {
			System.out.println("Please enable assertions for the program to run correctly");
			System.exit(0);
			// if assertsEnabled is false, then the program will inform the user to enable, and exit
		}
		// this is a test to see if assertions are enabled
		assert args.length == 1 : "Please enter one string to be incremented (no spaces)";
		// Makes sure args is the correct length (1)
		assert args[0].matches("\\[[0-9](,[0-9])*\\]") : "Arguments do not match correct input pattern";
		// this makes sure the string is in format [#0-9,#0-9,#0-9,etc...]
		StringBuilder s = new StringBuilder(args[0]);
		// Defines a stringbuilder, which is like a string but more mutable
		// and has more mutators
		for (int x = s.length() - 2; x > 0; x -= 2) {
			// starts at the end of the array, ignoring the bracket,
			// and decrements x by 2 every time (for the ","s)
			s.setCharAt(x, (char) ((s.charAt(x)) + 1));
			// This sets the index to one more than its value
			if ((s.charAt(x)) > 57) {
				// This compares the number to the ASCII value
				// of "9"
				s.setCharAt(x, (char) 48);
				// if more than 9, set to zero
				if (x == 1)
					// if x==1, then its the leading digit, so insert
					s.insert(1, "1,");
				// another digit that is always going to be 1
				continue;
				// if the number was 9, which rolls over,
				// continue the loop at the next number
			}
			break;
			// if the number is was 9, the addign is done, stop the lopp
		}
		System.out.println(s.toString());
		// prints out to string
	}
}