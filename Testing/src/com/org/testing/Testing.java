package com.org.testing;
public class Testing extends User {
	
	@Override
	void signIn() {
		System.out.println("user signed in");	
	}
	 public static void main(String[] arg)
	    {
		 User u = new Testing();
		 u.signIn();
		 
			 Lambda l = ()->{
				 System.out.println("coool");
			 };
			 l.show();
	    }
}
 abstract class User{
	 abstract void signIn();
 }
 
 
 interface Lambda{
	 public void show();
 }
