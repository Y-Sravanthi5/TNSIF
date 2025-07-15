package com.tnsif.methodoverriding;

public class MethodOverriding {
	public void run() {
        System.out.println("Vehicle is running");
    }
}
class Car extends MethodOverriding{
	public void run() {
	    System.out.println("Car is running smoothly");
	    }
	}
class Bike extends MethodOverriding {
	public void run() {
		System.out.println("Bike is running fast");
	        }

}
