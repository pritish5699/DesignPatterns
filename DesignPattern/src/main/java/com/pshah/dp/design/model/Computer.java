package com.pshah.dp.design.model;

//Super class in factory pattern can be an interface, abstract class or a normal java class.
public interface Computer {
	
	public String getCPU();
	public String getRAM();
	public String getHDD();
	public String toString();
}
