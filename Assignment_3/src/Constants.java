
public class Constants {
	
	/** Declare constants */

	public static final int MIN_SIZE = 8;
	public static final int MAX_SIZE = 28;
	public static final int MIN_PRICE = 0;
	public static final int MAX_PRICE = 30000;
	public static final String[] COLORS = new String[] {"green", "red", "blue", "pink", "black", "yellow"};
	

	
	public static int getMinSize() {
		return MIN_SIZE;
	}
	public static int getMaxSize() {
		return MAX_SIZE;
	}
	public static int getMinPrice() {
		return MIN_PRICE;
	}
	public static int getMaxPrice() {
		return MAX_PRICE;
	}
	
	public static String[] getBikeColors () {
		return COLORS;
	}
	
public Constants(){
	
}
public static void main(String[] args){
	
	for (int i =0; i< 9; i++){
		System.out.println(COLORS[i]);
	}
}
}

