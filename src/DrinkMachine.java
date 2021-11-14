//ToDo: Supervisor wants programmer comments (use /* */ comment)

//ToDo: Supervisor wants programmer comments (use /* */ comment)
public class DrinkMachine {
	public static final String SMALL = "small";
	public static final String MEDIUM = "medium";
	public static final String LARGE = "large";
	public static final double SMALL_VOLUME = 250.0;
	public static final double MEDIUM_VOLUME = 400.0;
	public static final double LARGE_VOLUME = 500.0;
	// ToDo: declare an EPSILON constant with value of 10.0
	// i.e. is measured volume within 10ml of expected volume?
	private double volume; // (ml)
	private String size; // "small", "medium", "large"

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public DrinkMachine() {
		this(DrinkMachine.MEDIUM_VOLUME, DrinkMachine.MEDIUM);
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public DrinkMachine(double volume, String size) {
		this.volume = volume;
		this.size = size;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public double getVolume() {
		return volume;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public void setVolume(double volume) {
		this.volume = volume;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public String getSize() {
		return size;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public void setSize(String size) {
		this.size = size;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public String verifySize() {
		String report = "";
		double difference = 0;

		switch (this.size) {
		case "small":
			difference = this.volume - DrinkMachine.SMALL_VOLUME;
			break;

		case "medium":
			difference = this.volume - DrinkMachine.MEDIUM_VOLUME;
			break;

		case "large":
			difference = this.volume - DrinkMachine.LARGE_VOLUME;
			break;

		default:
			report = String.format("size is %s, volume is %.1f ml, difference is %.1f ml, invalid size or volume",
					this.size, this.volume, difference);
			break;
		}

		if (report.equals("")) {
			difference = Math.abs(difference);
			double tolerance = 10;
			String in_out = "within";

			if (difference > tolerance)
				in_out = "outside";

			report = String.format("size is %s, volume is %.1f ml, difference is %.1f ml, %s tolerance of %.1f ml",
					this.size, this.volume, difference, in_out, tolerance);
		}

		return report;

	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	// ToDo: verify the menu is correct and fix any problems.
	public String drinkSizeMenu() {
		String report = String.format("Drink sizes:%n%s is %.1f (ml)%n%s is %.1f (ml)%n%s is %.1f (ml)",
				DrinkMachine.SMALL, DrinkMachine.SMALL_VOLUME, DrinkMachine.MEDIUM, DrinkMachine.MEDIUM_VOLUME,
				DrinkMachine.LARGE, DrinkMachine.LARGE_VOLUME);
		return report;
	}

}
