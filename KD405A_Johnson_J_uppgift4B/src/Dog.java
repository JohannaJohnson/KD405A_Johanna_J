
public class Dog extends Mammal {

	private boolean stupid;
	private String info2;

	// constructor
	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid = stupid;

	}

	// constructor 2?
	public Dog(String latinName, int gestationTime, boolean stupid, String friendlyName) {
		super(latinName, gestationTime);
		this.stupid = stupid;
		setFriendlyName(friendlyName);

	}

	// method that returns isStupid to stupid
	public boolean isStupid() {
		return stupid;
	}

	// method that prints the info about the dogs
	@Override
	public String getInfo() {
		if (stupid) {
			info2 = "stupid";
		} else {
			info2 = "not stupid";
		}

		return "A dog has the latin name " + getLatinName() + ", nurses for " + getGestationTime() + " months and is "
				+ info2;
	}
}
