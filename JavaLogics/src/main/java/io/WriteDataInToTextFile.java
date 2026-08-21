package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteDataInToTextFile {

	public static void main(String[] args) throws IOException {

		Path path = Path.of(System.getProperty("user.dir"),
				"JavaLogics", "src", "main", "java", "io", "WriteFile.txt");

		BufferedWriter bufferedWriter = Files.newBufferedWriter(path);

		bufferedWriter.write("Playwright");
		bufferedWriter.newLine(); // platform-independent line break

		bufferedWriter.write("Selenium");
		bufferedWriter.newLine(); // platform-independent line break

		bufferedWriter.write("RestAssured");
		bufferedWriter.newLine(); // platform-independent line break

		bufferedWriter.close();

		System.out.println("Finished Writing");
	}

}
