public class ServiceQueue {
    private QueueNode front;
    private QueueNode rear;
    private int size;

    public ServiceQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(Student student) {
        QueueNode newNode = new QueueNode(student);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("[ENQUEUE] " + student.getName() + " (" + student.getStudentNo() + ") joined the queue.");
    }

    public Student dequeue() {
        if (isEmpty()) {
            System.out.println("[DEQUEUE] Queue is empty. No student to serve.");
            return null;
        }
        Student served = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return served;
    }

    public Student peek() {
        if (isEmpty()) {
            System.out.println("[PEEK] Queue is empty.");
            return null;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getSize() {
        return size;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("-- Queue is empty --");
            return;
        }
        System.out.println("---- Students currently waiting (" + size + ") ----");
        QueueNode current = front;
        int position = 1;
        while (current != null) {
            System.out.println(position + ". " + current.data);
            current = current.next;
            position++;
        }
        System.out.println("-----------------------------------------");
    }
}