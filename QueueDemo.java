public class QueueDemo {
    public static void main(String[] args) {
        ServiceQueue queue = new ServiceQueue();

        System.out.println("=== Six students arrive at the service centre ===");
        queue.enqueue(new Student("221045678", "Maria", "Registration", 12));
        queue.enqueue(new Student("222034512", "Tomas", "Student Card", 5));
        queue.enqueue(new Student("223041876", "Ndapewa", "Fees", 8));
        queue.enqueue(new Student("221067341", "Simon", "Documents", 4));
        queue.enqueue(new Student("222098765", "Helvi", "Academic Enquiry", 10));
        queue.enqueue(new Student("223012345", "Josef", "Fees", 6));

        System.out.println();
        queue.displayQueue();

        System.out.println("\n=== Serving three students (FIFO order) ===");
        for (int i = 1; i <= 3; i++) {
            Student served = queue.dequeue();
            if (served != null) {
                System.out.println("[SERVED] " + served);
            }
        }

        System.out.println("\n=== Queue after serving three students ===");
        queue.displayQueue();

        System.out.println("\nNext student to be served (peek): " + queue.peek());
    }
}