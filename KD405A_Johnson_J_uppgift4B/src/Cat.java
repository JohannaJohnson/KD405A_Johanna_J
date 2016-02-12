
public class Cat extends Mammal {
	public int numberOfLifes;

	// Constructor
	public Cat(String latinName, int gestationTime, int numberOfLifes) {
		super(latinName, gestationTime);
		this.numberOfLifes = numberOfLifes;

	}

	// method to get number of lifes
	public int getNumberOfLifes() {
		return numberOfLifes;
	}

	// method to set number of lifes
	public int setNumberOfLifes(int i) {
		return this.numberOfLifes = i;
	}

	// method to print the info about the cats
	@Override
	public String getInfo() {

		return "A cat has the latin name " + getLatinName() + ", nurses for " + getGestationTime() + " months, and has " + getNumberOfLifes() + " lives...";
	}

}