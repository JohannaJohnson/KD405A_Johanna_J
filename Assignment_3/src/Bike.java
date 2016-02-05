
//1


/**Defining variables for the class Bike*/

public class Bike {
	private String color;
	private int price;
	private int size;
	
	public Bike(String color, int size) {
		this.size = size;
		this.color = color;
		this.price = 0;
		 boolean correctColor = false;
		if (size < Constants.MIN_SIZE || size > Constants.MAX_SIZE) {
		throw new IllegalArgumentException("The size must be between " + Constants.MIN_SIZE + " and " + Constants.MAX_SIZE); 
		  }
		for (int i = 0; i < Constants.COLORS.length; i ++) {
		if (Constants.COLORS[i].equalsIgnoreCase(color)){
		   correctColor = true;
		}
		}
		 if (!correctColor) {
		throw new IllegalArgumentException("The color must be approved "); 
		  }
		}
		/** creates a bike and checks if color, size and price are correct */
		public Bike(String color, int size, int price) {
		this.size = size;
		this.price = price;
		this.color = color;
		 boolean correctColor = false;
		if (price < Constants.MIN_PRICE || price > Constants.MAX_PRICE) {
		throw new IllegalArgumentException("The price must be between " + Constants.MIN_PRICE + " and " + Constants.MAX_PRICE); 
		  }
		if (size < Constants.MIN_SIZE || size > Constants.MAX_SIZE) {
		throw new IllegalArgumentException("The size must be between " + Constants.MIN_SIZE + " and " + Constants.MAX_SIZE); 
		  }
		for (int i = 0; i < Constants.COLORS.length; i ++) {
		if (Constants.COLORS[i].equalsIgnoreCase(color)){
		   correctColor = true;
		}
		}
		 if (!correctColor) {
		throw new IllegalArgumentException("The color must be approved "); 
		  }
		}
		Chattkonversationen är avslutad



/** Constructors, creates bikes with colors, sizes and prices*/
	
	public Bike(String color, int size){
		this.color = color;
		this.size = size;
	}
	
	
	public Bike(String color, int size, int price) {

			this.price = price;
			this.size = size;
			this.color = color;
	
	}




/**This is the methods, this one defines the colors*/
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	
/**Defines the price */
	
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
/**Defines the size*/
	
	public int getSize() {
		return this.size;
	}
	public void setSize(int size){
	this.size = size;
}

}
