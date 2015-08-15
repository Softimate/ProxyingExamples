package com.orbitz.cop.samples.proxying.builder;

import java.lang.reflect.Proxy;

import com.orbitz.cop.samples.proxying.garage.Vehicle;
import com.orbitz.cop.samples.proxying.proxies.VehicleInvocationHandler;

public class ProxyBuilder {

	public static Vehicle buildVehicle(Object object) {
		ClassLoader classLoader = Vehicle.class.getClassLoader();
		Vehicle proxiedvehicle = (Vehicle) Proxy.newProxyInstance(classLoader,
				new Class[] { Vehicle.class }, new VehicleInvocationHandler(
						object));
		return proxiedvehicle;
	}

}
