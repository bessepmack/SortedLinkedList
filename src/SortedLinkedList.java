import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * A program that reads a list of integers from user input,
 * stores them in a LinkedList, sorts them in ascending order,
 * and prints the sorted list.
 * 
 * To compile: javac SortedLinkedList.java
 * To run: java SortedLinkedList
 * To generate Javadoc: javadoc -d docs SortedLinkedList.java
 * 
 */
public class SortedLinkedList {

    /**
     * Default constructor for the SortedLinkedList class.
     * This constructor initializes a new instance of the SortedLinkedList class.
     */
    public SortedLinkedList() {
        // Default constructor, no instantiation.
    }

    /**
     * The main method reads integers from user input,
     * stores them in a LinkedList, sorts them in ascending order,
     * and prints the sorted list.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create a LinkedList to store the integer numbers
        List<Integer> numbers = new LinkedList<>();

        System.out.println("Enter integers separated by spaces. Press Enter to finish: ");

        // Read the input line
        String input = scanner.nextLine();
        scanner.close();

        // Split the input line into individual strings
        String[] nums = input.split("\\s+");

        // Convert each string to an integer and add it to the list
        for (String num : nums) {
            numbers.add(Integer.parseInt(num));
        }

        // Sort the LinkedList in ascending order
        Collections.sort(numbers);

        // Print the sorted list
        System.out.println("Sorted List:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}