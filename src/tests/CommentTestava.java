package tests;

public class CommentTestava {

	public static void main(String[] args) {
		
		String myname = "Hetal";
		System.out.println(myname);
		String lastname = "Pansuriya";
		System.out.println(lastname);
		String space = " ";
		
		//String s = "Hello";  //Single line connect
		//system.out.printIn(s);
		
		System.out.println(myname + lastname);
		System.out.println(myname+" "+lastname);
		System.out.println(myname+space+lastname);
		
		int a = 50;    
		int b = 40;
		
		 
		System.out.println(myname+lastname+a+b);
		System.out.println(a+b+myname+lastname);
		System.out.println(myname+lastname+(a+b));
		
		System.out.println(myname.charAt(2));
		System.out.println(myname.indexOf('t'));
	

	}

}
