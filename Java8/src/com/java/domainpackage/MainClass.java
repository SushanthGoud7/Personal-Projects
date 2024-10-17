package com.java.domainpackage;

public class MainClass {
	public static void main(String[] args) {
		Bike bikeObj = new Bike();
		bikeObj.setBikeType("B6 addition");
		bikeObj.setBikeName("pulsar");
		Util.print(bikeObj);
	}
}
