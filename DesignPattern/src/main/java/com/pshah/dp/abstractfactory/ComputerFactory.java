package com.pshah.dp.abstractfactory;

import com.pshah.dp.design.model.Computer;

public class ComputerFactory {
	
	
	public static Computer getComputer(ComputerAbstactFactory factory){
		return factory.createComputer();
	}
}
