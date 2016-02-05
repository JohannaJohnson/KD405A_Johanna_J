import java.util.ArrayList;

public class BikeStore {
	
	
	/** Returns info if all bikes are String */
	private ArrayList<Bike> allBikes = new ArrayList<Bike>();
	
	
	public BikeStore() {
	/**	allBikes.add(new Bike("yellow", 15, 30000));
		allBikes.add(new Bike("blue", 13, 10200));
		allBikes.add(new Bike("red", 21, 3400));
		allBikes.add(new Bike("blue", 13, 10200));
		allBikes.add(new Bike("yellow", 15, 30000));
		allBikes.add(new Bike("blue", 13, 10200));
		allBikes.add(new Bike("yellow", 15, 30000));
		allBikes.add(new Bike("blue", 13, 10200));
		allBikes.add(new Bike("yellow", 15, 30000));
		allBikes.add(new Bike("blue", 13, 10200)); */
	}
	
	/**
	public String allBikes(){
		//Här skriver du ut cyklarna
		
		String returnString = "";
		for (int i = 0; i < allBikes.size(); i++){
			returnString += ("bike " + (i +1) + "is the size" + allBikes.get(i).getSize() + " and is the color " + allBikes.get(i).getColor() + " and has the price " + allBikes.get(i).getPrice() + "\n");
		System.out.println();
		}
		return returnString;
	}
	*/
	

//Här skapas en regel för att lägga till cyklar
	
	public String getAllBikes() {
	String s = "";
		for (Bike b: allBikes){
			s = s + "is the color" + b.getColor() + "and the size" + b.getSize() + "and the price" + b.getPrice() + "\n";
		}
		return s;
	}
	public void addBike(String color, int price, int size){
		Bike b = new Bike(color, price, size);
		this.allBikes.add(b);
	}

}

