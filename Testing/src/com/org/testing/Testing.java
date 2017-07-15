package com.org.testing;
public class Testing{
	
	 public static void main(String[] arg)
	    {
	        Rectangle re = new Rectangle();
	        re.draw();
	    }   
}

 class Rectangle implements Drawable{
	  public void draw(){
		 
		 System.out.println("drawawa");
		 System.out.println("drawawa");
		 
	 }
 }
interface Drawable{  
 void draw();
} 
