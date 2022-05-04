package tests;

public class Test2 {

/*	public static void blue() {				//static method..we don't create object
		System.out.println("blue");
	}
									
	public void red() {				
		System.out.println("red");
	}*/									//it wont run because there is no main method
	
	public static void blue() {		//static(don't need to create object because we already have in main in Test 1 IMP
	System.out.println("blue");
}
								
	public void red() {				//non static(have to create object)
	System.out.println("red");		//red is in which class= test 2..see above
}
	
	//method name as class name
	//no return type
	 
	public Test2() {								//constructor will run before main method
		System.out.println("I am in constructor");	//constructor will run automatically in Test1
	}
	
}







