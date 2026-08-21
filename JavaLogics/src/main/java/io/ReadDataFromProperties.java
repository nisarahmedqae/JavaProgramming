package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class ReadDataFromProperties {

	public static void main(String[] args) throws IOException {

		Path path = Path.of(System.getProperty("user.dir")
				, "JavaLogics", "src", "main", "java", "io", "data.properties");

		InputStream inputStream = Files.newInputStream(path);
		Properties properties = new Properties();
		properties.load(inputStream);

		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));

		properties.setProperty("name", "nahmed");
		System.out.println(properties.getProperty("name"));
	}

}
