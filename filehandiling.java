import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            System.out.print("Enter content to write to the file: ");
            String content = scanner.nextLine();

            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();

            System.out.println("Content written to the file.");

            System.out.println("\nFile content:");
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
            fileReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
