
public class Dog extends Mammal{
	
	private boolean stupid;

//constructor
	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid = stupid;
		
	}
	
	public Dog(String latinName, int gestationTime, boolean stupid, String friendlyName){
		super(latinName, gestationTime);
		this.stupid = stupid;
		setFriendlyName(friendlyName);
		

	}

	
	public boolean isStupid(){
		return stupid;
	}

	@Override
	public String getInfo() {
		
		return "The dog named " + getFriendlyName() + "has the latin name " + getLatinName() + "nurses for " + getGestationTime() + "ans is " + isStupid() ;
	}
}
