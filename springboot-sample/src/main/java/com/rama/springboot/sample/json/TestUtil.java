package com.rama.springboot.sample.json;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestUtil {

public static void main(String[] args) throws IOException {
		
		//read json file data to String
		byte[] jsonData = Files.readAllBytes(Paths.get("D:/test.json"));
		
		//create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();
		
		//convert json string to object
		Root root = objectMapper.readValue(jsonData, Root.class);
		
		for (TrainingPhrase t : root.getTrainingPhrases()) {
			for (Part p : t.getParts()) {
				System.out.println(p.getText());
			}
		}
		
		try (Stream<Path> paths = Files.walk(Paths.get("D:\\Personal\\Others\\Support"))) {
		    paths
		        .filter(Files::isRegularFile)
		        .filter(p -> p.getFileName().toString().endsWith(".json"))
		        .forEach(fileName -> System.out.println(fileName));
		} 
	}
}
