
public class Snake extends Animal{
	
	private boolean poisonus;
	
//Constructor
	public Snake(String latinName, boolean poisonus) {
		super(latinName);
			this.poisonus = poisonus;
		
	}

	public boolean isPoisonus(){
		return poisonus;

	}

	@Override
	public String getInfo() {
		
		return null;
	}

}

