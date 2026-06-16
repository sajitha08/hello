import java.util.LinkedList;
public class day10 {
    static void main() {
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("Box");
        queue.add("Bottel");
        queue.add("Bag");
        queue.add("Bike");
        queue.add("Bite");
        while(!queue.isEmpty()) {
            process(queue);
        }
    }
    static void process(LinkedList<String> queue){
        String removed=queue.removeFirst();
        System.out.println("Removed:"+removed);

    }
}
