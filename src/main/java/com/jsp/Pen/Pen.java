package com.jsp.Pen;

public class Pen {

	private String name;
	private String color;
	private double price;
	
	public Pen() {
		System.out.println("Pen Object is created.....");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public void printPenDetails() {
	System.out.println(name);
	System.out.println(color);
	System.out.println(price);
	}
}
