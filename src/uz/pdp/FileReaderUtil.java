package uz.pdp;

import java.io.*;

public class FileReaderUtil {
    public static void readFile(String sourceFilePath, String destinationFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }
            System.out.println("io1.txt file.");
        } catch (IOException e) {
            System.out.println(" error files.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String sourceFilePath = "IO/io.txt";
        String destinationFilePath = "IO/io1.txt";

        readFile(sourceFilePath, destinationFilePath);
    }
}
