package org.exception_Handling;

public class PrintException {
public static void main(String[] args) {
	try {
		
		System.out.println(10/0);
	}
	catch (Exception j) {
		String message = j.getMessage();
		System.out.println(message);
		j.printStackTrace();
	}
}
}
