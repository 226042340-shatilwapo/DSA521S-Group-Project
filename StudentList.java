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

    void insertAtPosition(String studentNo, String studentName, String serviceType, int estimatedTime, int position) {
        Node newNode = new Node(studentNo, studentName, serviceType, estimatedTime);

        if (position == 1 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int count = 1;
        while (current.next != null && count < position - 1) {
            current = current.next;
            count++;
        }

        newNode.next = current.next;
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
    Node searchStudent(String studentNo) {
    Node current = head;
    while (current != null) {
        if (current.studentNo.equals(studentNo)) {
            return current;
        }
        current = current.next;
    }
    return null;
}

void deleteStudent(String studentNo) {
    if (head == null) {
        System.out.println("List is empty.");
        return;
    }

    if (head.studentNo.equals(studentNo)) {
        head = head.next;
        return;
    }

    Node previous = head;
    Node current = head.next;

    while (current != null) {
        if (current.studentNo.equals(studentNo)) {
            previous.next = current.next;
            return;
        }
        previous = current;
        current = current.next;
    }

    System.out.println("Student not found.");
}

}