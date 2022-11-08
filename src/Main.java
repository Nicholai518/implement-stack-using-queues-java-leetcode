public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.print("MyStack : ");

        while (!myStack.empty()) {
            System.out.print(myStack.pop() + " ");
        }
    }
}
