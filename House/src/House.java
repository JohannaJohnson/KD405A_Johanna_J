

public class House{
	
	 private int yearBuilt;
	 private int size;
	 
	 private final int minSize = 10;
	 private final int maxSize = 1000;
	 private final int minYear = 1800;
	 private final int maxYear = 2015;
	 
	 public House(int yearBuilt,int size){
		 this.size = size;
		 this.yearBuilt = yearBuilt;

	 }
	 
	 public int getYear(){
	return this.yearBuilt;
	 }
	 
	 public int getSize(){
	 return this.size;

	 }
	}