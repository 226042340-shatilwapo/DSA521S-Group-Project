public class StudentList {
    Node head;

    StudentList() {
        head = null;
    }

    void insertAtStart(String studentNo, String studentName, String serviceType, int estimatedTime) {
        Node newNode = new Node(studentNo, studentName, serviceType, estimatedTime);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(String studentNo, String studentName, String serviceType, int estimatedTime) {
        Node newNode = new Node(studentNo, studentName, serviceType, estimatedTime);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void displayStudents() {
        Node current = head;
        if (current == null) {
            System.out.println("No students in the list.");
            return;
        }
        while (current != null) {
            System.out.println(current.studentNo + " | " + current.studentName + " | " + current.serviceType + " | " + current.estimatedTime + " min");
            current = current.next;
        }
    }
}
