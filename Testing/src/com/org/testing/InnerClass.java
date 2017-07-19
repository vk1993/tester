package com.org.testing;



public class InnerClass {

	public static void main(String[] args) {
		
         InnerClass.StaicInner stat = new StaicInner();
          stat.i = 10;
          stat.print();
          
          InnerClass inner = new InnerClass();
          
          InnerClass.Member nonstat = inner.new Member();
          
          
          InnerClass.Member.Mmember insider = nonstat.new Mmember();
          insider.signUp();
          nonstat.printt();      
	}
	
	static class StaicInner{
		int i ;
		void print(){
			System.out.println("value of i = " +i);
		}
	}
	
	class Member{
		 void printt(){
			 System.out.println("fajkds ahbdskf akhbsdkhfa");
		 }
		class Mmember{
			boolean signUp(){
				System.out.println("i am inside of everything");
				return true;
			}
		}
	}

}
