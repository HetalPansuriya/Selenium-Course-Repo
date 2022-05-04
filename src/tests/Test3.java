package tests;

public class Test3 {

	static Test3 t3 = new Test3();
	static Test1IMP t1= new Test1IMP();
	
	public static void main(String[] args) {

		circle();				//3.call circle
		
		t3.square();			//4.call square
		
		Test1IMP.printMe();     //7.call printMe();
				
		t1.testMe();			//8.call testMe();
		
	}

	
	//1. Create static circle();
	public static void circle( ) {
		System.out.println("circle");
	}
	
	//2. Create non-static method Square();
	public void square( ) {
		System.out.println("square");
	}
}
