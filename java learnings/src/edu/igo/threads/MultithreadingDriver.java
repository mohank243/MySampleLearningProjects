package edu.igo.threads;

public class MultithreadingDriver extends Thread{
	public static void main(String[] args) {
		MultithreadingDriver multithreadingDriver = new MultithreadingDriver();
		Thread t = new Thread(multithreadingDriver);
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Parent Thread"+t.getName());
		}
		
		t.start();
		
		
		
	}
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("ChildThreas");
		}
	}
}
