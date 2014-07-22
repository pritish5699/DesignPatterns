package com.pshah.dp.singleton;

public class EagerInitializedSingleton {
	
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	//private construct to disallow instantization outside class.
	private EagerInitializedSingleton(){}
	
	public static EagerInitializedSingleton getInstance(){
		return instance;
	}
}
