package com.pshah.dp.singleton;

public class StaticBlockSingleton {
	
	
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton(){}
	static{
		try{
			instance = new StaticBlockSingleton();
		}
		catch(Exception e){
			throw new RuntimeException("Error while creating object of StaticBlockSingleton class");
		}
	}
	
	public static StaticBlockSingleton getInstance(){
		return instance;
	}
}
