
//2 & 3
import java.util.ArrayList;

public class Main {

	private static ArrayList<Bike> allBikes = new ArrayList<Bike>();
	private static Bike [] getBikes;

	
	public static void main(String[] args) {

		
		Bike Bike0 = new Bike("green", 11, 820);
		allBikes.add(Bike0);
		Bike Bike1 = new Bike("red", 9, 5430);
		allBikes.add(Bike1);
		Bike Bike2 = new Bike("blue", 12, 654);
		allBikes.add(Bike2);
		Bike Bike3 = new Bike("pink", 22, 6213);
		allBikes.add(Bike3);
		Bike Bike4 = new Bike("black", 19, 9865);
		allBikes.add(Bike4);
		Bike Bike5 = new Bike("yellow", 20, 1234);
		allBikes.add(Bike5);
		Bike Bike6 = new Bike("green", 10, 3000);
		allBikes.add(Bike6);
		Bike Bike7 = new Bike("red", 17, 2000);
		allBikes.add(Bike7);
		Bike Bike8 = new Bike("blue", 19, 1000);
		allBikes.add(Bike8);
		Bike Bike9 = new Bike("pink", 17, 1357);
		allBikes.add(Bike9);
		
		int index = 0;
		int i = 0;
		for(Bike bikes : allBikes){
			System.out.println("plats nummer" + (index++) + "bike " +(i++)+ bikes.getSize() + " " + bikes.getPrice() + " " + bikes.getColor() + "\n");
			
			
		}
	}
}
			
