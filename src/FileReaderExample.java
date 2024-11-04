import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void readFile(String filename) {

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {

            System.out.println("File not found.");
        }
    }

    public static void main(String[] args) {

        readFile("src/testfiles/testfile.txt");
        readFile("nonexistent.txt");
    }
}
