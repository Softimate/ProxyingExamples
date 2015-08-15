package com.orbitz.cop.samples.proxying.proxies;

import com.orbitz.cop.samples.proxying.garage.Vehicle;

public class VehicleProxy implements Vehicle {

	private Vehicle vehicle;
	
	public VehicleProxy(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public String getName() {
		return vehicle.getName();
	}

	public void start() {
		vehicle.start();
	}

	public void forward() {
		vehicle.forward();
	}
}
