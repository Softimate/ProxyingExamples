package com.orbitz.cop.samples.proxying.proxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class VehicleInvocationHandler implements InvocationHandler{
	private Object object;
	
	public VehicleInvocationHandler(Object object) {
		this.object = object;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return method.invoke(object, args);
	}

}
