package com.orbitz.cop.samples.proxying.garage;

public class HeavyVehicle implements Vehicle {

	private String name;
	
	public HeavyVehicle(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void start() {
		System.out.println(name + " Started!");
	}

	public void forward() {

		System.out.println(name + " is moving forward. . . .");
	}

	public void reverse() {
		System.out.println(name + " is moving in reverse direction. . . ");
	}

	public void stop() {
		System.out.println(name + " Stopped!");
	}

}
