import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
        Queue<Integer> q = new LinkedList<>();

        public MyStack() {

        }

        public void push(int x) {
            q.add(x);
            int k = q.size();

            // reversing / rotating queue
            for(int i=0; i<k-1; i++){
                Integer first = q.remove();
                q.add(first);
            }
        }

        public int pop() {

            // because we are rotating / reversing our queue after an Integer has been added
            // we can simply remove the first Integer
            return q.remove();
        }

        public int top() {
            // because we are rotating / reversing our queue after an Integer has been added
            // we can simply remove the first Integer
            return q.peek();
        }

        public boolean empty() {
            return q.isEmpty();
        }
    }
