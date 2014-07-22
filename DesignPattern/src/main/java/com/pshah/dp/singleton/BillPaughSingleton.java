package com.pshah.dp.singleton;

public class BillPaughSingleton {
	
	private BillPaughSingleton(){};
	
	private static class SingletonHelper{
		private static final BillPaughSingleton INSTANCE = new BillPaughSingleton();
	}
	
	public static BillPaughSingleton getIntance(){
		return SingletonHelper.INSTANCE;
	}
}
