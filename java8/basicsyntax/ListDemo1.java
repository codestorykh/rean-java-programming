package com.learningjava.java8.basicsyntax;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		
		List<String> pointList = new ArrayList<String>();
		pointList.add("1");
		pointList.add("2");
		 
		pointList.forEach(p ->  {
		                            System.out.println(p);
		                            //Do more work
		                        }
		                 );
		
		new Thread(
			    () -> System.out.println("My Runnable")
			).start();
		
	}
}
