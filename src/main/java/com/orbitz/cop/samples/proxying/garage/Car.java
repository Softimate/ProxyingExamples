package com.orbitz.cop.samples.proxying.garage;

public class Car implements Vehicle {

	private String name;
	
	public Car(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return this.name;	
	}

	public void start() {
		System.out.println("Car: "+ name + " Started !");
	}

	public void forward() {
		System.out.println("Car: " + name + " is moving forward. . . .");
	}

	public void reverse() {
		System.out.println("Car: " + name + " is moving in reverse direction. . . ");
	}

	public void stop() {
		System.out.println("Car: " + name + " Stopped!!");
	}
	
	public void boomBoom() {
		System.out.println("0 to 60 in 3.5");
	}

}
