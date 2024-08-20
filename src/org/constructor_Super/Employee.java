package org.constructor_Super;

public class Employee extends Company {
//Default constructor
	public Employee() {
		System.out.println("default constructor");
	}
	//parameterized constructor
	public Employee(int id) {
		super(id);
		System.out.println("int para constructor:"+id);
		
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		Employee e1=new Employee(100);

	}
	
	
	
	
	
	
}
