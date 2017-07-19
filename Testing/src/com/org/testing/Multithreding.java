package com.org.testing;

public class Multithreding {
	
	public static void main(String[] args) {
		Threaded th = new Threaded();
		th.start();
		Thread.currentThread().setName("visalCreation");
		Thread obj = Thread.currentThread();
		System.out.println(obj);
		System.out.println(Thread.currentThread().getName());
		th.setName("shaliniCreation");
		System.out.println(th.getName());
		
		for(int i=0; i<=5; i++){
			System.out.println("mainThread");
		}
	}
}

class Threaded extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0 ;i<10 ;i++){
			try {
				Thread.sleep(1000);
				System.out.println("thread");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}