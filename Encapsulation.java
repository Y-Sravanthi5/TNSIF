package com.tnsif.encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setEid(1);
		int id=obj.getEid();
		System.out.println(id);
		obj.setEname("Sravanthi");
		String result=obj.getEname();
		System.out.println(result);


	}

}
