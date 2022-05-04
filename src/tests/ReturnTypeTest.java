package tests;

public class ReturnTypeTest {

	public static void main(String[] args) {
	
		int x = sum();	
		int y = x+5;			//call method
		
		System.out.println(sum());	//9  //or system.out.println(x);
		System.out.println(x);	    //9
		System.out.println(y);      //14

		String a = hello();
		System.out.println(a);
	}
	
	//in under method/string we don't have "void" word so we can't save value.. so to save value we have to give other character as "a" to print value of "s"

	public static int sum() {				//is call method
		int a = 4+5;				       //value of i
		return a;						//9	//if we want output we require Return type
	}
	
	public static String hello() {
		String s = "Hello Java";
		return s;						//return can be INTEGER/STRING..
	}
	
}
