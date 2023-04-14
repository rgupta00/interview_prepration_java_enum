package com.busycoder.enum_examples;
//S,M,L,XL,XXL
//S(38), M(40), L(42), XL(44), XXL(46);

interface A{
	void foof();
}
enum ShirtSize2 implements A{
	S,M,L,XL,XXL;

	@Override
	public void foof() {
		
	}
}

enum ShirtSize{
	S(38), M(40), L(42), XL(44), XXL(46);
	int sizeValue;
	
	private ShirtSize(int sizeValue){
		this.sizeValue=sizeValue;
	}

	public int getSizeValue() {
		return sizeValue;
	}
	@Override
	public String toString() {
		return "value of size is "+ sizeValue;
	}
	
}

class Shirt {
	private String brand;
	private String color;
	private ShirtSize size;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ShirtSize getSize() {
		return size;
	}

	public void setSize(ShirtSize size) {
		this.size = size;
	}

	public Shirt(String brand, String color, ShirtSize size) {
		this.brand = brand;
		this.color = color;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Shirt [brand=" + brand + ", color=" + color + ", size=" + size + "]";
	}

}

public class A_NeedOfEnum {

	public static void main(String[] args) {

		//how to convert a enum to String
		
//		ShirtSize s=ShirtSize.L;
//		String sValue=s.toString();
		
		
		//how to convert a String to enum
		
//		String value="w";
//		ShirtSize shirtSize=ShirtSize.valueOf(value);
//		System.out.println(shirtSize.toString());
		
		//can we iterate through enum?
		ShirtSize[] values = ShirtSize.values();
		for(ShirtSize size:values) {
			System.out.println(size.name()+": "+ size.ordinal()+" :"+ size.toString()+": "+size.getSizeValue());
		}
		
		Shirt shirt=new Shirt("peter eng", "blue", ShirtSize.L);
		System.out.println(shirt);
	}
}




