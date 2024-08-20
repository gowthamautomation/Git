package org.constructor;

public class Employee {
			
	public Employee() {
		
		System.out.println("default constructor");
		
	}
public	Employee(int empid){
		System.out.println("parameterized constructor:"+empid);
	}
	public Employee(String empname,float empsalary) {
		System.out.println("Empname:"+empname+"\n"+8500);
	}	
	public static void main(String[] args) {
		Employee e=new Employee();
		Employee e1=new Employee(55);
		Employee e2=new Employee("Gowtham",850000);


	}
		
	}
	

	
	
	
	
	

