package tests;

import selenium.Test4;  // need to import when class is in different package

public class Test1IMP {
													//these are objects
	//ClassName objName = ClassName();
	static Test1IMP t1 = new Test1IMP();  //this will impact in all methods
	static Test2 t2 = new Test2();
	static Test3 t3= new Test3();
	static Test4 t4 = new Test4();
	
	
	public static void main(String[] args) {

		//Test1IMP t1 = new Test1IMP();		this will only impact in this particular class
		System.out.println("I'm in main method");
		scanMe();
		printMe();									//printMe is a method not variable
		System.out.println("After printMe");
		t1. testMe();
		t1.paintMe();	//we don't create new object as this is also non static because we already have created for all non static in main class. like t1.
		Test2.blue();		//static method from different class
		t2.red();   		//non-static method from different class
		Test3.circle(); //5.call circle
		t3.square();//6.call square
		Test4.bmw();
		t4.audi();
		ArgumentsTest.sum(100, 200);
		
	
	}
	
	public static void printMe() {
		System.out.println("I'm in printMe");
	} 
	
	public static void scanMe() {
		System.out.println("scanMe");
	}

	public void testMe() {
		System.out.println("testMe");
	}
	
	public void paintMe(){
		System.out.println("printMe");
	}
}
