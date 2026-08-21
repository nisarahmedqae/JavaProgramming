package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileContentCount {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        // count total chars, words and lines in a given file

        Path path = Path.of(System.getProperty("user.dir"),
                "JavaLogics", "src", "main", "java", "io", "ReadFile.txt");

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        BufferedReader bufferedReader = Files.newBufferedReader(path);
        String currLine = bufferedReader.readLine();

        while (currLine != null) {
            currLine = currLine.trim();
            lineCount++;

            // words
            String[] words = currLine.split("\\s+");
            wordCount = wordCount + words.length;

            // chars
            for (String singleWord : words) {
                charCount = charCount + singleWord.length();
            }
            currLine = bufferedReader.readLine();
        }

        System.out.println("total lines: " + lineCount);
        System.out.println("total words: " + wordCount);
        System.out.println("total chars: " + charCount);
    }

}
