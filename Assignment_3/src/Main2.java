
public class Main2 {
		
	
	public Main2() {
		
	
	}
	
	public static void main(String[] args) {
		
		BikeStore bikeStore = new BikeStore();
		bikeStore.addBike("blue", 4002, 26);
		bikeStore.addBike("red", 30000, 28);
		
		System.out.println(bikeStore.getAllBikes());

	}
	

	}


