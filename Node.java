public class Node {
    String studentNo;
    String studentName;
    String serviceType;
    int estimatedTime;
    Node next;

    Node(String studentNo, String studentName, String serviceType, int estimatedTime) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.serviceType = serviceType;
        this.estimatedTime = estimatedTime;
        this.next = null;
    }
}
