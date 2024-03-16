package com.codestroykh.java8.writereadfile;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteFileDemo {

	
	public static void main(String[] args) throws IOException {
		
		//Get the file reference
		Path path = Paths.get("E:/javasolo/JavaBasicFunction/output1.txt");
		 
		//Use try-with-resource to get auto-closeable writer instance
		try (BufferedWriter writer = Files.newBufferedWriter(path)) 
		{
		    writer.write("Lokesh\r\n" + 
		    		"Gupta\r\n" + 
		    		"Never\r\n" + 
		    		"store\r\n" + 
		    		"password\r\n" + 
		    		"except\r\n" + 
		    		"in mind.");
		}
		
		
		/**
		 * one ways
		 */
		
	/*	String content = "Hello World swewewe !!";
		Files.write(Paths.get("E:/javasolo/JavaBasicFunction/output.txt"), content.getBytes());*/
		
	}
	
}
