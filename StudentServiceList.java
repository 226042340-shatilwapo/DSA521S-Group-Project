import java.util.Scanner;

public class StudentServiceList {

    // ==========================================
    // NODE CLASS
    // ==========================================
    static class Node {

        int studentNumber;
        String studentName;
        String serviceType;
        int estimatedServiceTime;

        Node next;

        Node(int studentNumber, String studentName,
             String serviceType, int estimatedServiceTime) {

            this.studentNumber = studentNumber;
            this.studentName = studentName;
            this.serviceType = serviceType;
            this.estimatedServiceTime = estimatedServiceTime;
            this.next = null;
        }
    }

    // Head points to the first node
    Node head = null;


    // ==========================================
    // INSERT AT BEGINNING
    // ==========================================
    public void insertAtBeginning(int studentNumber,
                                   String studentName,
                                   String serviceType,
                                   int estimatedServiceTime) {

        Node newNode = new Node(
            studentNumber,
            studentName,
            serviceType,
            estimatedServiceTime
        );

        newNode.next = head;
        head = newNode;

        System.out.println("Student inserted successfully.");
    }


    // ==========================================
    // INSERT AT END
    // ==========================================
    public void insertAtEnd(int studentNumber,
                            String studentName,
                            String serviceType,
                            int estimatedServiceTime) {

        Node newNode = new Node(
            studentNumber,
            studentName,
            serviceType,
            estimatedServiceTime
        );

        // If the list is empty
        if (head == null) {
            head = newNode;
            System.out.println("Student inserted successfully.");
            return;
        }

        Node current = head;

        // Move to the last node
        while (current.next != null) {
            current = current.next;
        }

        // Connect last node to new node
        current.next = newNode;

        System.out.println("Student inserted successfully.");
    }


    // ==========================================
    // INSERT AT POSITION
    // ==========================================
    public void insertAtPosition(int studentNumber,
                                 String studentName,
                                 String serviceType,
                                 int estimatedServiceTime,
                                 int position) {

        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        // Position 1 = beginning
        if (position == 1) {
            insertAtBeginning(
                studentNumber,
                studentName,
                serviceType,
                estimatedServiceTime
            );
            return;
        }

        Node newNode = new Node(
            studentNumber,
            studentName,
            serviceType,
            estimatedServiceTime
        );

        Node current = head;

        // Move to the node before the desired position
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position does not exist.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;

        System.out.println("Student inserted successfully.");
    }


    // ==========================================
    // DELETE STUDENT
    // ==========================================
    public void deleteStudent(int studentNumber) {

        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        // If the first student is the one to delete
        if (head.studentNumber == studentNumber) {

            head = head.next;

            System.out.println("Student deleted successfully.");
            return;
        }

        Node current = head;

        // Search for the node before the student
        while (current.next != null &&
               current.next.studentNumber != studentNumber) {

            current = current.next;
        }

        // Student not found
        if (current.next == null) {
            System.out.println("Student not found.");
            return;
        }

        // Skip the student
        current.next = current.next.next;

        System.out.println("Student deleted successfully.");
    }


    // ==========================================
    // SEARCH STUDENT
    // ==========================================
    public void searchStudent(int studentNumber) {

        Node current = head;

        while (current != null) {

            if (current.studentNumber == studentNumber) {

                System.out.println("\nStudent found!");
                System.out.println("----------------------------");
                System.out.println("Student Number: "
                                   + current.studentNumber);
                System.out.println("Student Name: "
                                   + current.studentName);
                System.out.println("Service Type: "
                                   + current.serviceType);
                System.out.println("Estimated Service Time: "
                                   + current.estimatedServiceTime
                                   + " minutes");
                System.out.println("----------------------------");

                return;
            }

            current = current.next;
        }

        System.out.println("Student not found.");
    }


    // ==========================================
    // DISPLAY STUDENTS
    // ==========================================
    public void displayStudents() {

        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;

        System.out.println("\n========== STUDENT RECORDS ==========");

        while (current != null) {

            System.out.println(
                "Student Number: " + current.studentNumber
                + " | Name: " + current.studentName
                + " | Service: " + current.serviceType
                + " | Time: " + current.estimatedServiceTime
                + " minutes"
            );

            current = current.next;
        }

        System.out.println("=====================================\n");
    }


    // ==========================================
    // MAIN METHOD
    // ==========================================
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StudentServiceList list = new StudentServiceList();

        int choice;

        do {

            System.out.println("\n========================================");
            System.out.println("       STUDENT SERVICE RECORDS");
            System.out.println("========================================");
            System.out.println("1. Insert student at beginning");
            System.out.println("2. Insert student at end");
            System.out.println("3. Insert student at position");
            System.out.println("4. Delete student");
            System.out.println("5. Search student");
            System.out.println("6. Display students");
            System.out.println("7. Exit");
            System.out.println("========================================");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student Number: ");
                    int number1 = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name1 = input.nextLine();

                    System.out.print("Enter Service Type: ");
                    String service1 = input.nextLine();

                    System.out.print("Enter Estimated Service Time: ");
                    int time1 = input.nextInt();

                    list.insertAtBeginning(
                        number1,
                        name1,
                        service1,
                        time1
                    );

                    break;


                case 2:

                    System.out.print("Enter Student Number: ");
                    int number2 = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name2 = input.nextLine();

                    System.out.print("Enter Service Type: ");
                    String service2 = input.nextLine();

                    System.out.print("Enter Estimated Service Time: ");
                    int time2 = input.nextInt();

                    list.insertAtEnd(
                        number2,
                        name2,
                        service2,
                        time2
                    );

                    break;


                case 3:

                    System.out.print("Enter Student Number: ");
                    int number3 = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name3 = input.nextLine();

                    System.out.print("Enter Service Type: ");
                    String service3 = input.nextLine();

                    System.out.print("Enter Estimated Service Time: ");
                    int time3 = input.nextInt();

                    System.out.print("Enter Position: ");
                    int position = input.nextInt();

                    list.insertAtPosition(
                        number3,
                        name3,
                        service3,
                        time3,
                        position
                    );

                    break;


                case 4:

                    System.out.print("Enter Student Number to delete: ");
                    int deleteNumber = input.nextInt();

                    list.deleteStudent(deleteNumber);

                    break;


                case 5:

                    System.out.print("Enter Student Number to search: ");
                    int searchNumber = input.nextInt();

                    list.searchStudent(searchNumber);

                    break;


                case 6:

                    list.displayStudents();

                    break;


                case 7:

                    System.out.println("Exiting program...");
                    break;


                default:

                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 7);


        input.close();
    }
}