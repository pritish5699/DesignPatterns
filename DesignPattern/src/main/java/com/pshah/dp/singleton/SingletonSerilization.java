package com.pshah.dp.singleton;

import java.io.Serializable;

public class SingletonSerilization implements Serializable {
	
	private static final long serialVersionUID = 5188206133736443631L;
	
	private SingletonSerilization(){}
	
	private static class SingletonHelper{
		private static final SingletonSerilization INSTANCE = new SingletonSerilization();
	}
	
	public static SingletonSerilization getInstance(){
		return SingletonHelper.INSTANCE;
	}
	
	protected Object readResolve() {
	    return getInstance();
	}

}
