package com.codestroykh.java8.writereadfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadLinesUsingFileReader {

	
	public static void main(String[] args) throws IOException {
		
		File file = new File("E:/javasolo/JavaBasicFunction/output.txt");
	    FileReader fr = new FileReader(file);
	    BufferedReader br = new BufferedReader(fr);
	    String line;
	    while((line = br.readLine()) != null){
	        if(line.contains("password")){
	            System.out.println(line);
	        }
	    }
	    br.close();
	    fr.close();
	}
	
}
