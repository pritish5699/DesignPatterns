package com.pshah.dp.factory;

import com.pshah.dp.factory.model.Computer;
import com.pshah.dp.factory.model.PC;
import com.pshah.dp.factory.model.Server;

//We can keep Factory class Singleton or we can keep the method that returns the subclass as static.
public class ComputerFactory {
	
	public static Computer getComputer(String type, String cpu, String ram, String hdd){
		if(type.equalsIgnoreCase("PC")){
			return new PC(cpu, ram, hdd);
		}
		else if(type.equalsIgnoreCase("SERVER")){
			return new Server(cpu, ram, hdd);
		}
		return null;
	}
}
