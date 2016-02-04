import java.util.ArrayList;

public class BikeStore {
	
	
	/** Returns info if all bikes if all bikes are String */
	
	private ArrayList<Bike> allBikes = new ArrayList<Bike>();
	public String getAllBikes1(){
		
		String returnString = "";
		for (int i = 0; i < bikes.size(); i++){
			returnString += ("bike " + (i +1) + "is the size" + bikes.get(i).getSize() + " and is the color " + bikes.get(i).getColor() + " and has the price " + bikes.get(i).getPrice() + "\n");
		}
		return returnString;
	}
	public void addBike(String color, int size, int price){
		
		bikes.add(new Bike(color, size, price));
	}

	
	public BikeStore(String allBikes) {
		this.allBikes1 = allBikes; 
		
	}


	public String getAllBikes() {
		return this.allBikes;
	}
	public void addBike(Bike s){
		allBikes.add(s);
	}

}

