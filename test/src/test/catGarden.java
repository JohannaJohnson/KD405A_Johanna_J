package test;

import java.util.ArrayList;

public class catGarden {
	private ArrayList<Cat> allCats;
	private String name;
	
	public catGarden(String name){
		allCats = new ArrayList<Cat>();
		this.name = name;
	}
	
	public void addCat(Cat c){
		if (allCats.size() <101){
			allCats.add(c);
		}
	}
	
	public void killCat(){
		allCats.remove(0);
		
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	/*
	public String getCats(){
		String s = this.name+"\n";
		for(Cat vat : allCats){
			s = s + cat.getName()+"\n";
		}
		return s;
	}*/


}
