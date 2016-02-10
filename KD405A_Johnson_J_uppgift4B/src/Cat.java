
public class Cat extends Mammal{
	public int numberOfLifes;
	
//Constructor	
	public Cat(String latinName, int gestationTime, int numberOfLifes) {
		super(latinName, gestationTime);
		
	}

public int getNumberOfLifes(){
	return numberOfLifes;
}

public int setNumberOfLifes(int i){
	return numberOfLifes = i;
}

@Override
public String getInfo() {

	return null;
}
	
}

