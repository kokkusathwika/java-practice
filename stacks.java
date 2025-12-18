
import java.util.ArrayList;

class stack {

    ArrayList<Integer> list = new ArrayList<>();

    public int peak() {
        return list.get(list.size() - 1);
    }

    public void push(int value) {
        list.add(value);
    }

    public int pop() {
        int temp = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return temp;
    }
}

public class stacks {

    public static void main(String[] args) {

        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.print("Top element is: ");
        System.out.println(s.peak());

        s.pop();

        System.out.print("New top element is: ");
        System.out.println(s.peak());

        System.out.print("last element is: ");
        System.out.println(s.peak());

    }

}
