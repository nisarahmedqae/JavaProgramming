package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class ReadDataFromTextFile {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {

        // Build path relative to project root (works on any OS)
        Path path = Path.of(System.getProperty("user.dir")
                , "JavaLogics", "src", "main", "java", "io", "ReadFile.txt");

        String strContent = Files.readString(path);
        System.out.println(strContent);

        List<String> listContent = Files.readAllLines(path);
        System.out.println(listContent);

    }

}
