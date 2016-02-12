
public class Snake extends Animal {

	private boolean poisonus;
	private String info;

	// Constructor
	public Snake(String latinName, boolean poisonus) {
		super(latinName);
		this.poisonus = poisonus;
		
	}

	// method that returns poisonus
	public boolean isPoisonus() {
		return poisonus;

	}

	// method to print the info about the snakes
	@Override
	public String getInfo() {
		if (poisonus) {
			info = "poisonus ";
		} else {
			info = " not poisonus";
		}
		return "A snake has the latin name " + getLatinName() + " and is " + info + "\n";
	}

}
