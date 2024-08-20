package org.constructor;

public class This {
	public This() {

		System.out.println("default");

	}

	public This(int empid) {
		this();
		System.out.println("id:" + empid);
	}

	public This(String empname, float empsalary) {
		this(100);

		System.out.println("Name:" + empname + "\n" + "salary:" + empsalary);

	}

	public static void main(String[] args) {

		This u = new This("Gowtham", 8500);

	}

}
