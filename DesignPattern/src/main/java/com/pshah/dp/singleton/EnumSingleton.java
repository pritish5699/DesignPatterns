package com.pshah.dp.singleton;

public enum EnumSingleton {
	INSTANCE;
	
	public static void doSomthing(){
		System.out.println("Hello Enum Singleton");
	}
	
}
