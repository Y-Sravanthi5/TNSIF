package com.tnsif.methodoverriding;

public class MethodOverridingM {

	public static void main(String[] args) {
		MethodOverriding v;

        v = new Car();  
        v.run();         

        v = new Bike();  
        v.run();         
    }

	}


