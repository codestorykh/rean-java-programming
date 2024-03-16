package com.codestroykh.java8.writereadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class ReadStreamOfLinesUsingFilesWithTryBlock {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("E:/javasolo/JavaBasicFunction", "output1.txt");
		// The stream hence file will also be closed here
		try (Stream<String> lines = Files.lines(path)) {
			Optional<String> hasPassword = lines.filter(s -> s.contains("password")).findFirst();
			if (hasPassword.isPresent()) {
				System.out.println(hasPassword.get());
			}
		}
	}
}
