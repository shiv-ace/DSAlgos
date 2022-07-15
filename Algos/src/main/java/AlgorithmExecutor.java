import java.util.ArrayList;
import java.util.List;

public class AlgorithmExecutor {
    public static void main(String[] args) {
        // executeMinMaxSum();
        // executeTimeConverter();
        // executeReverseLinkedList();
        // executeRecursions();
        // executeHashMapImplementation();
        // executeSelectionSort();
        executeQueueBasedStack();
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

    private static void executeRecursions() {
        Recursions recursions = new Recursions();
        System.out.println(recursions.getFibonacciNumber(5));
        System.out.println(recursions.getFactorial(5));
    }

    private static void executeHashMapImplementation() {
        HashMapImpl<String, Integer> integerHashMap = new HashMapImpl<>();
        integerHashMap.put("USA", 1);
        integerHashMap.put("Nepal", 2);
        integerHashMap.put("India", 3);
        integerHashMap.put("Australia", 4);

        System.out.println(integerHashMap.get("USA"));
    }

    private static void executeSelectionSort() {
        SelectionSort selectionSort = new SelectionSort();
        int arr[] = {64, 25, 12, 22, 11};
        selectionSort.sort(arr);
        System.out.println("Sorted array");
        selectionSort.printArray(arr);
    }

    private static void executeQueueBasedStack() {
        QueueBasedStack queueBasedStack = new QueueBasedStack();
        queueBasedStack.push(10);
        queueBasedStack.push(20);
        System.out.println("Top element :" + queueBasedStack.top());
        queueBasedStack.pop();
        queueBasedStack.push(30);
        queueBasedStack.pop();
        System.out.println("Top element :" + queueBasedStack.top());
    }
}
