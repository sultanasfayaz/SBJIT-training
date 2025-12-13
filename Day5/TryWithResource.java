package day5;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) {

        try (FileInputStream file_input_stream = new FileInputStream("sample.txt")) {

            int data;
            while ((data = file_input_stream.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException exception) {
            System.out.println("File error: " + exception.getMessage());
        }
    }
}
                                                     