
//1


/**Defining variables for the class Bike*/

public class Bike {
	private String color;
	private int price;
	private int size;
	


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
