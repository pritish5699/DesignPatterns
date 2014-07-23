package com.pshah.dp.abstractfactory;

import com.pshah.dp.design.model.Computer;
import com.pshah.dp.design.model.PC;

public class PCFactory implements ComputerAbstactFactory {
	
	String cpu;
	String ram;
	String hdd;
	
	public PCFactory(String cpu, String ram, String hdd){
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	@Override
	public Computer createComputer() {
		return new PC(cpu, ram, hdd);
	}
	
	
}
