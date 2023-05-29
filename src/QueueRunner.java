import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//오름차순으로 정렬
class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String value1, String value2) {
        return Integer.compare(value1.length(), value2.length());
        //정렬을 반대로 뒤집고 싶으면 (value2.length(), value1.length()) 순서로 작성하면 됨
    }
}

public class QueueRunner {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.addAll(List.of("Zebra", "Monkey", "Cat"));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
