package edu.igo.springlearning;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	String bikeName;
	public String getBikeName() {
		return bikeName;
	}
	
	
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public void drive() {

		System.out.println("riding a "+bikeName+" Bike");
	}

}
