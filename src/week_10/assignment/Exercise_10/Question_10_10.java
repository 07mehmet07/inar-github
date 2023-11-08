package week_10.assignment.Exercise_10;

public class Question_10_10 {
    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
            System.out.print(i + " ");
        }
        System.out.println("\n\nProcess of Dequeue : ");
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}

