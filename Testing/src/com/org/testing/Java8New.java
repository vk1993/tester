package com.org.testing;

public class Java8New implements DefaultMethod{

	public static void main(String[] args)throws Exception {
      
		 Java8New jy = new Java8New();
		 jy.hrllo();
//		 Runtime.getRuntime().exec("notepad");
		  System.out.println(Runtime.getRuntime().availableProcessors());  
	}

}

interface DefaultMethod{
	default void hrllo(){
		System.out.println("its woring and we can use any where any tihng");
	}
	
	
}