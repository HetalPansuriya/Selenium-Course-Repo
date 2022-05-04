package tests;

public class ConditionTest {

	public static void main(String[] args) {

	//use conditions to check weather test pass or fail
		
		int a = 10;
		int b = 20;			//if(condition)..don't use semi colan in end after conditions
		if(a==b) {
			System.out.println("equal");	
		}else {
			System.out.println("not equal");
		}
		
		
		int x = 30;
		int y = 30;
		if(x==y) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		
		
//== we use to compare numbers or which is not string	
//.equal is a method, usually use to compare Strings/methods.
		
		
String expected = "Selenium";
String actual = "selenium";

	if(expected .equals (actual)) {
		System.out.println("equal");}
	else {
		System.out.println("not equal");
		}
		
		}
	}

