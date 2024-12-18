import java.util.ArrayList;
import java.util.Scanner;

class Test<Genericex> {
    Genericex obj;

    Test(Genericex obj) {
        this.obj = obj;
    }

    public Genericex getObject() {
        return this.obj;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ArrayList to store user inputs
        ArrayList<Object> list = new ArrayList<>();

        System.out.println("Choose a data type:");
        System.out.println("1. Integer");
        System.out.println("2. String");
        System.out.println("3. Double");

        while (true) {
            System.out.print("\nEnter your choice (or -1 to quit): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            if (choice == -1) {
                break; // Exit loop if user enters -1
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer: ");
                    Integer intInput = scanner.nextInt();
                    list.add(new Test<>(intInput).getObject());
                    break;

                case 2:
                    System.out.print("Enter a string: ");
                    String strInput = scanner.nextLine();
                    list.add(new Test<>(strInput).getObject());
                    break;

                case 3:
                    System.out.print("Enter a double: ");
                    Double doubleInput = scanner.nextDouble();
                    list.add(new Test<>(doubleInput).getObject());
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

        scanner.close();

        // Print all stored inputs
        System.out.println("\nStored inputs:");
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
