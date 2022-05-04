package tests;

public class PrintTest {

	public static void main(String[] args) {
		
		
		System.out.print("Selenium");
		System.out.print("Java");
		System.out.println("Junit"); //set the pointer to the next line
		
		System.out.print("TestNG");     //set the pointer in the same line
		System.out.println("Jekins");   //set the pointer in the next line
		
		System.out.print("Git");
		System.out.println("svn");
		
		System.out.print("Git");
		System.out.println();          //set the pointer in the next line
		System.out.print("svn");	
		
		//or
		
		System.out.println("Git"); //it won't print GIT in next line bcz former line has PRINT instead PRINTLN
		System.out.print("svn");
		
		 //  For this just add blank line to add space where you want word in next line
		
		System.out.println();
		System.out.println("Git"); //it won't print GIT in next line bcz former line has PRINT instead PRINTLN
		System.out.print("svn");  //  For this just add blank line to add space where you want word in next line
	}

}
