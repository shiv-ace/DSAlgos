import java.util.ArrayList;
import java.util.List;

public class AlgorithmExecutor {
    public static void main(String[] args) {
        // executeMinMaxSum();
        // executeTimeConverter();
        executeReverseLinkedList();
    }

    private static void executeMinMaxSum() {
        List<Integer> inputList = new ArrayList<>();
        inputList.add(396285104);
        inputList.add(573261094);
        inputList.add(759641832);
        inputList.add(819230764);
        inputList.add(364801279);

        MinMaxSum minMaxSum = new MinMaxSum();
        minMaxSum.getMinMaxSum(inputList);
    }

    private static void executeTimeConverter() {
        String date = "12:05:45AM";
        System.out.println(new TimeConverter().convertTime(date));
    }

    private static void executeReverseLinkedList() {
        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(4);
        inputList.add(3);
        inputList.add(5);
        inputList.add(5);

        LinkedList linkedList = new LinkedList();
        linkedList.populateLinkedList(inputList);
        linkedList.printList(linkedList.getHead());
        // LinkedList.Node node = linkedList.reverse(linkedList.getHead());
        linkedList.removeUnsortedDuplicates(linkedList.getHead());
        linkedList.printList(linkedList.getHead());
    }
}