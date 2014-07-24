package com.pshah.dp.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{
	
	private List<String> empList;
	
	public Employees(){
		this.empList = new ArrayList<String>();
	}
	
	public Employees(List<String> list){
		this.empList = list;
	}
	
	public void loadData(){
		//database call to get data and store it in list.
		empList.add("Pritish Shah");
		empList.add("John Doe");
		empList.add("David Scott");
		empList.add("Mona Young");
	}
	
	public List<String> getEmpList(){
		return empList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> temp = new ArrayList<String>();
		for(String employee : empList){
			temp.add(employee);
		}
		return new Employees(temp);
	}
	
}
