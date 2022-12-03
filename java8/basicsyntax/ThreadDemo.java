package com.learningjava.java8.basicsyntax;

public class ThreadDemo {

	public static void main(String[] args) {
		/*new Thread(new Runnable() {
		    @Override
		    public void run() {
		        System.out.println("howtodoinjava");
		    }
		}).start();*/
		
		
		new Thread(
	            () ->   { 
	                        System.out.println("My Runnable"); 
	                    }
	         ).start();
		
		
	}
}
