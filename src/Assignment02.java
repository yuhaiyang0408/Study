
//ToDo: Supervisor wants programmer comments (use /* */ comment)

//ToDo: Supervisor wants programmer comments (use /* */ comment)
public class Assignment02 {

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public static void main(String[] args) {
		DrinkMachine machine = new DrinkMachine();
		User user = new User();
		// (other variables as needed)
		Boolean exit = false;

		do {
			// ToDo:
			// Ask for drink size as text, prompt using the menu generated
			// from a method in DrinkMachine
			String menu = machine.drinkSizeMenu();
			System.out.println(menu);
			System.out.println("drink sizes are case-sensitive");

			String size = user.inputString("Enter size (small, medium, or large): ");
			machine.setSize(size);

			// Ask for measured volume, accepting decimal places
			double volume = user.inputDouble("Enter volume: ");
			machine.setVolume(volume);

			// determine if the volume matches the expected size using the
			// verifySize() method, printing the returned report.
			String report = machine.verifySize();
			System.out.println(report);

			// print out your name on screen
			System.out.println("Program by Haiyang Yu");
			// ask if there is more data to enter (yes, no) and continue
			String again = user.inputString("Continue program (yes/no)? ");
			exit = again.toLowerCase().equals("no");
			// using a loop only if the user enters some form of yes
			// e.g. "YES" "yEs" "yeS" would be acceptable (any capitalization)
		} while (!exit);
		// you can use any decision structure or loop for this program,
		// however a for-loop is not recommended.
		System.out.println("Program has exited.");

	}

}