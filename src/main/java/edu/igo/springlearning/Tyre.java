package edu.igo.springlearning;


public class Tyre {

	String brand;
	
	Tyre(){}
	Tyre(String brand){
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String toString() {
		return "Tyre is "+getBrand();
	}
}
