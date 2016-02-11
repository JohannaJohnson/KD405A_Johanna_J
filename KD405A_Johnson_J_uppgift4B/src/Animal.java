
public abstract class Animal {

	private String latinName;
	private String friendlyName;

	// Constructor
	public Animal(String latinName) {
		this.latinName = latinName;
	}

	// method for info
	public abstract String getInfo();

	// method to set friendly name
	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	// method to get friendly name
	public String getFriendlyName() {
		return friendlyName;
	}

	// method to get latin name
	public String getLatinName() {
		return latinName;
	}
}
