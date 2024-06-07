package com.example.demo.beans;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Menu {
//	public Veg veg;
//	public NonVeg nonVeg;
//	public Beverages beverages;
//	public Desserts desserts;
	int sectionId;
	String sectionName;
	List<Items> items;
	
	

}
