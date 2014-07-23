package com.pshah.dp.factory.model;

public class PC implements Computer{
	
	String cpu;
	String ram;
	String hdd;
	
	public PC(String cpu, String ram, String hdd){
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	
	@Override
	public String getCPU() {
		return this.cpu;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}
	
	@Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }

}
