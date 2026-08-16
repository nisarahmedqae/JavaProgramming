package io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class CrossPlatformPath {
    public static void main(String[] args) throws IOException {
        // Build path relative to project root (works on any OS)
        Path filePath = Path.of(System.getProperty("user.dir")
                , "JavaLogics", "src", "main", "java", "io", "ReadFile.txt");

        String content = Files.readString(filePath);
        System.out.println(content);
    }
}