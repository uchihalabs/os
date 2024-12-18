import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static <T> void addElementsToArrayList(ArrayList<T> list, Scanner scanner, Class<T> type) {
        while (true) {
            System.out.print("Enter an element (or type 'exit' to stop): ");
            if (type == Integer.class) {
                if (scanner.hasNextInt()) {
                    list.add(type.cast(scanner.nextInt()));
                } else if (scanner.next().equalsIgnoreCase("exit")) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter an Integer.");
                }
            } else if (type == Double.class) {
                if (scanner.hasNextDouble()) {
                    list.add(type.cast(scanner.nextDouble()));
                } else if (scanner.next().equalsIgnoreCase("exit")) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a Double.");
                }
            } else if (type == String.class) {
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    list.add(type.cast(input));
                }
            }
        }
    }
    public static <T> void getElementAtIndex(ArrayList<T> list, int index) {
        if (index >= 0 && index < list.size()) {
            System.out.println("Element at index " + index + ": " + list.get(index));
        } else {
            System.out.println("Invalid index.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which type of list do you want?");
        System.out.println("1. Integer");
        System.out.println("2. Double");
        System.out.println("3. String");
        System.out.print("Choose 1, 2, or 3: ");
        int choice = scanner.nextInt();
        ArrayList<?> list = null;
        Class<?> type = null;
        if (choice == 1) {
            list = new ArrayList<Integer>();
            type = Integer.class;
        } else if (choice == 2) {
            list = new ArrayList<Double>();
            type = Double.class;
        } else if (choice == 3) {
            list = new ArrayList<String>();
            type = String.class;
        } else {
            System.out.println("Invalid choice.");
            return;
        }
        addElementsToArrayList((ArrayList) list, scanner, type);
        System.out.println("ArrayList: " + list);
        System.out.print("Enter the index to get the element: ");
        int index = scanner.nextInt();
        getElementAtIndex((ArrayList) list, index);
        scanner.close();
}
}
