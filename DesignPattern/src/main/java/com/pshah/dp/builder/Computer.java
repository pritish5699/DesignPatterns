package com.pshah.dp.builder;

public class Computer {

	// required parameters
	private String cpu;
	private String ram;
	private String hdd;

	// optional paramters
	private boolean isGrahphicEnabled;
	private boolean isBluetoothEnabled;
	
	
	public String getCpu() {
		return cpu;
	}

	public String getRam() {
		return ram;
	}

	public String getHdd() {
		return hdd;
	}

	public boolean isGrahphicEnabled() {
		return isGrahphicEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	private Computer(ComputerBuilder builder) {
		this.cpu = builder.cpu;
		this.ram = builder.ram;
		this.hdd = builder.hdd;
		this.isGrahphicEnabled = builder.isGrahphicEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}
	
	@Override
	public String toString(){
		return "CPU= " + this.cpu + " RAM= "  + this.ram + " HDD= " + this.hdd + " isGrahphicEnabled= " + this.isGrahphicEnabled + " isBluetoothEnabled= " + this.isBluetoothEnabled; 
	}
	public static class ComputerBuilder {

		// required parameters
		private String cpu;
		private String ram;
		private String hdd;

		// optional paramters
		private boolean isGrahphicEnabled;
		private boolean isBluetoothEnabled;

		public ComputerBuilder(String cpu, String ram, String hdd) {
			this.cpu = cpu;
			this.ram = ram;
			this.hdd = hdd;
		}

		public ComputerBuilder setIsGrahphicEnabled(boolean isGrahphicEnabled) {
			this.isGrahphicEnabled = isGrahphicEnabled;
			return this;
		}

		public ComputerBuilder setIsBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}
}
