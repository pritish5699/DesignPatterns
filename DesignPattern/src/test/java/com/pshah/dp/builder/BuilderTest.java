package com.pshah.dp.builder;

public class BuilderTest {
	
	public static void main(String[] args) {
        //Using builder to get the object in a single line of code and 
                //without any inconsistent state or arguments management issues     
        Computer comp = new Computer.ComputerBuilder("Intel i-7",
        		 "2 GB", "500 GB").setIsGrahphicEnabled(true).build();
        System.out.println(comp.toString());
        
    }
}
