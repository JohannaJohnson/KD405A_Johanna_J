
public class Human {
	
	//Instance fields
	private Dog dog; 
	private String name;
	private String info;
	
	
	//Constructor
	public Human(String name){
		this.name = name;
	}
	
	//Mutators
	public String getName(){
		return name;
	}
	
	public Dog buyDog(Dog dog1){
		this.dog = dog1;
		return dog;
	}
	
	public String getInfo(String info){
		if(dog == null){
			info = getName() + " har ingen hund";
		} else{
			info = getName() + " har en hund som heter " + dog.getName();
			}
		return info;
	}
	
}

