import java.util.ArrayList;

public class BikeStore {
	
	
	/** Returns info if all bikes are String */
	private ArrayList<Bike> allBikes = new ArrayList<Bike>();
	
	
	public BikeStore() {
	
	}
	
	

//Här skapas en regel för att lägga till cyklar
	
	public String getAllBikes() {
	String s = "";
		for (Bike b: allBikes){
			s = s + " is the color " + b.getColor() + " and the size " + b.getSize() + " and the price " + b.getPrice() + "\n";
		}
		return s;
	}
	public void addBike(String color, int price, int size){
		Bike b = new Bike(color, price, size);
		this.allBikes.add(b);
	}

}

