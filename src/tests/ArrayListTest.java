package tests;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		//ClassName objName = ClassName();
		ArrayList<String> tools = new ArrayList<String>();
		
		tools.add("selenium");
		tools.add("java");
		tools.add("ANT");
		tools.add("Maven");
		System.out.println(tools.size());
		
		System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));
		
		tools.add("Jenkins");
		System.out.println(tools.size());
		
		tools.remove("Jenkins");
		System.out.println(tools.get(2));
		
		System.out.println("..................");
		
		for (int i=0; i<tools.size(); i++) {
			System.out.println(tools.get(i));
		}
	}

}
