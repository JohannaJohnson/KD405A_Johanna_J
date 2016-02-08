
//1


/**Defining variables for the class Bike*/

public class Bike {
	private String color;
	private int price;
	private int size;
	
	public Bike(int size, String color, int price) {
		this.size = size;
		this.color = color;
		this.price = 0; 
		
		this.color = "colorless";
		for(String s : Constants.COLORS){
			if (s.toLowerCase().equals(color.toLowerCase())){
				this.color = color;
		
		/**boolean hej = false;
		for(int i = 0; i < Constants.COLORS.length; i++){
			if(Constants.COLORS[i].equals(color)){
			hej = true;
			*/
	}
		
			
		}	
	
	/**
			
	
	
	if(hej == true){
		this.color = color;
	}
	
	else{
		this.color = "false";
	}
		
	
	*/
	}
		/**
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
		
		*/


/** Constructors, creates bikes with colors, sizes and prices*/
	
	public Bike(String color, int size){
		this.color = color;
		this.size = size;
	}
	
	
	public Bike(String color, int size, int price) {

			this.color = color;
			this.size = size;
			this.price = price;
			
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
