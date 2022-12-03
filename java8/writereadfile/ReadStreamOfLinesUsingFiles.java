package com.learningjava.java8.writereadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class ReadStreamOfLinesUsingFiles {

	public static void main(String[] args) throws IOException {
		
		Stream<String> lines = Files.lines(Paths.get("E:/javasolo/JavaBasicFunction", "output1.txt"));
	    Optional<String> hasPassword = lines.filter(s -> s.contains("password")).findFirst();
	    if(hasPassword.isPresent()){
	        System.out.println(hasPassword.get());
	    } 
	    //Close the stream and it's underlying file as well
	    lines.close();
	    
	}
}
