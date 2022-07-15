import java.util.LinkedList;
import java.util.Queue;

public class QueueBasedStack {
    final Queue<Integer> queue = new LinkedList<>();

    // Push operation
    void push(int val) {
        // get previous size of queue
        int size = queue.size();

        // Add current element
        queue.add(val);

        // Pop (or Dequeue) all previous
        // elements and put them after current
        // element
        for (int i = 0; i < size; i++) {
            // this will add front element into
            // rear of queue
            int x = queue.remove();
            queue.add(x);
        }
    }

    // Removes the top element
    int pop() {
        if (queue.isEmpty()) {
            System.out.println("No elements");
            return -1;
        }
        int x = queue.remove();
        return x;
    }

    // Returns top of stack
    int top() {
        if (queue.isEmpty())
            return -1;
        return queue.peek();
    }

    // Returns true if Stack is empty else false
    boolean isEmpty() {
        return queue.isEmpty();
    }
}
