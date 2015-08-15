package com.orbitz.cop.samples.proxying.launch;

import java.lang.reflect.Proxy;

import com.orbitz.cop.samples.proxying.builder.ProxyBuilder;
import com.orbitz.cop.samples.proxying.garage.Car;
import com.orbitz.cop.samples.proxying.garage.HeavyVehicle;
import com.orbitz.cop.samples.proxying.garage.Vehicle;
import com.orbitz.cop.samples.proxying.proxies.VehicleInvocationHandler;
import com.orbitz.cop.samples.proxying.proxies.VehicleProxy;

@SuppressWarnings("unused")
public class VehicleOperator {

	public static void main(String[] args) {
		
		driveWithoutProxy();
//		driveWithProxy();
//		drivewithDynamicProxy();
//		dynamicProxyDriverUsingBuilder();
	}
		
	
	
	private static void driveWithoutProxy() {

		//--------- Drive a BMW WITHOUT proxy ------------
			Vehicle bmw = new Car("BMW");
			bmw.start();
			bmw.forward();

	}
	
	private static void driveWithProxy() {
	//----- Drive a Truck WITH proxy--------------------------
		
		Vehicle jcb = new HeavyVehicle("Truck");
		VehicleProxy proxiedTruck = new VehicleProxy(jcb);
		proxiedTruck.start();
		proxiedTruck.forward();
	}
	
	private static void drivewithDynamicProxy() {
		
		
	//------ Drive a BMW with dynamic proxying------------------
		Vehicle bmw = new Car("BMW");
		Vehicle bmwProxy = (Vehicle) Proxy.newProxyInstance( Vehicle.class.getClassLoader(),
				new Class[] { Vehicle.class }, new VehicleInvocationHandler(
						bmw));
		bmwProxy.start();
		bmwProxy.forward();
	}
	
	
	
	
	
	
	
	
	private static void dynamicProxyDriverUsingBuilder() {
		Vehicle porche = ProxyBuilder.buildVehicle(new Car("Porche"));
		porche.start();
		porche.forward();
		Vehicle bus = ProxyBuilder.buildVehicle(new HeavyVehicle("Bus"));
		bus.start();
		bus.forward();
	}
}
