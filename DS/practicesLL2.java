import java.util.Scanner;

public class practicesLL2 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // Scanner for user input
      LL2 list = new LL2();          // Create a new Linked List
        int choice;                              // Variable to store menu choice

        // Infinite loop to keep showing menu until exit
        while (true) {
            // Display menu
            System.out.println("\n=== Linked List Menu ===");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at a specific index");
            System.out.println("4. Delete first node");
            System.out.println("5. Delete last node");
            System.out.println("6. Delete node at specific index");
            System.out.println("7. Display list");
            System.out.println("8. Find a value");
            System.out.println("9. Get size of list");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();   // Read user choice

            switch (choice) {
                case 1:  // Insert at beginning
                    System.out.print("Enter value to insert at beginning: ");
                    int val1 = sc.nextInt();
                    list.insertFirst(val1);   // Call insertFirst method
                    System.out.println(val1 + " inserted at beginning.");
                    break;

                case 2:  // Insert at end
                    System.out.print("Enter value to insert at end: ");
                    int val2 = sc.nextInt();
                    list.insertLast(val2);    // Call insertLast method
                    System.out.println(val2 + " inserted at end.");
                    break;

                case 3:  // Insert at specific index
                    System.out.print("Enter value to insert: ");
                    int val3 = sc.nextInt();
                    System.out.print("Enter index (0-based): ");
                    int indexInsert = sc.nextInt();
                    try {
                        list.insertAtMiddle(val3, indexInsert);  // Call insertAtMiddle
                        System.out.println(val3 + " inserted at index " + indexInsert);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:  // Delete first node
                    try {
                        int delFirst = list.deleteFirst();      // Call deleteFirst
                        System.out.println(delFirst + " deleted from beginning.");
                    } catch (IllegalStateException e) {
                        System.out.println("Error: List is empty.");
                    }
                    break;

                case 5:  // Delete last node
                    try {
                        int delLast = list.deleteLast();        // Call deleteLast
                        System.out.println(delLast + " deleted from end.");
                    } catch (IllegalStateException e) {
                        System.out.println("Error: List is empty.");
                    }
                    break;

                case 6:  // Delete at specific index
                    System.out.print("Enter index to delete (0-based): ");
                    int delIndex = sc.nextInt();
                    try {
                        int delValue = list.deleteAtParticularIndex(delIndex);
                        System.out.println(delValue + " deleted at index " + delIndex);
                    } catch (IndexOutOfBoundsException | IllegalStateException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 7:  // Display list
                    System.out.println("Current Linked List:");
                    list.display();         // Call display method
                    break;

                case 8:  // Find a value
             break;

                case 9:  // Show size of list
                    System.out.println("Size of list: " + list.size());  // Call size method
                    break;

                case 0:  // Exit program
                    System.out.println("Exiting program...");
                    sc.close();        // Close Scanner
                    System.exit(0);    // Terminate program
                    break;

                default:  // Invalid input
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}