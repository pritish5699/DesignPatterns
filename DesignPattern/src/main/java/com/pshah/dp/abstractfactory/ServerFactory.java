package com.pshah.dp.abstractfactory;

import com.pshah.dp.design.model.Computer;
import com.pshah.dp.design.model.Server;

public class ServerFactory implements ComputerAbstactFactory {
	String cpu;
	String ram;
	String hdd;
	
	public ServerFactory(String cpu, String ram, String hdd){
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	
	@Override
	public Computer createComputer(){
		return new Server(cpu, ram, hdd);
	}
}
