package tests;

public class ArrayTest {

	public static void main(String[] args) {

		String tool = "Selenium";
		System.out.println(tool);
						//to save different strings..
		
		String tools[] = {"Selenium","Java","ant","maven","jenkins"};
		System.out.println(tools.length);

	/*System.out.println(tools[0]);	//selenuim
	System.out.println(tools[1]);	//java
	System.out.println(tools[2]);	//ant
	System.out.println(tools[3]);	//maven
	System.out.println(tools[4]);	//jenkins*/

	/*	for (int i = 0; i<tools.length; i++) {
			System.out.println(tools[i]); }*///or
			
			for (String a: tools) {
				System.out.println(a);
			}
}
}