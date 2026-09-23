public class Main {
    public static void main(String[] args) {
        StudentList list = new StudentList();

        list.insertAtEnd("221045678", "Maria", "Registration", 12);
        list.insertAtEnd("222034512", "Tomas", "Student Card", 5);
        list.insertAtEnd("223041876", "Ndapewa", "Fees", 8);
        list.insertAtEnd("221067341", "Simon", "Documents", 4);
        list.insertAtPosition("224011111", "Peter", "Enquiries", 6, 3);
Node found = list.searchStudent("223041876");
if (found != null) {
    System.out.println("Found: " + found.studentName);
}

list.deleteStudent("222034512");
        list.displayStudents();
    }
}