package com.org.testing;
public class Testing extends User{
	
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
			 l.print(10);			 
			 
	    }	 
	 
}
 abstract class User{
	 abstract void signIn();
 }
 
 
 interface Lambda{
	 public void show();
	 default void print(int n){
		 if(n>0 && n%2==0){
			 System.out.println("enter number is even"+ n);
		 }
		 else{
			 System.out.println("the number is odd");
		 }
	 }
 }
