
//2 & 3
import java.util.ArrayList;


public class Main {

	private static ArrayList<Bike> allBikes = new ArrayList<Bike>();
	private static Bike [] myBikes;

	
	public static void main(String[] args) {
		
		myBikes = new Bike [10];
		
		myBikes[0] = new Bike ("green", 11, 820);
		myBikes[1] = new Bike ("red", 9, 5430);
		myBikes[2] = new Bike ("blue", 12, 654);
		myBikes[3] = new Bike ("pink", 22, 6213);
		myBikes[4] = new Bike ("black", 19, 9865);
		myBikes[5] = new Bike ("yellow", 20, 1234);
		myBikes[6] = new Bike ("green", 10, 30000);
		myBikes[7] = new Bike ("red", 17, 20000);
		myBikes[8] = new Bike ("blue", 19, 1000);
		myBikes[9] = new Bike ("silver", 167,1234567);
	
		
for (int i = 0; i < 10; i++){
	System.out.println("Bike " + (i) + " is the size " + myBikes[i].getSize() + " has the price " + myBikes[i].getPrice() + " and is " + myBikes[i].getColor());
		
	if(myBikes[i].getPrice() < Constants.getMinPrice()|| myBikes[i].getPrice() > Constants.getMaxPrice()){
		System.out.println( + myBikes[i].getPrice() + " is the wrong price, the price should be between " + Constants.getMinPrice() + " and " + Constants.getMaxPrice()); {
			
		}
		
		if(myBikes[i].getSize() < Constants.getMinSize()|| myBikes[i].getSize() > Constants.getMaxSize()){
			System.out.println( myBikes[i].getSize() + " is the wrong size, the size should be between " + Constants.getMinSize() + " and " + Constants.getMaxSize()); {
				
		
		}
		
		if(!myBikes[i].getColor().equals(Constants.bikeColors[i])){
			System.out.println(myBikes[i].getColor() + "is the wrong color" + "\n");
					

		}
		}
			
}
	}
	}
}
		
