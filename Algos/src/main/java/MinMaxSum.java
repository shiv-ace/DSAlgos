import java.util.List;

public class MinMaxSum {

    public void getMinMaxSum(List<Integer> arr) {
        long minElement = Integer.MAX_VALUE;
        long maxElement = 0;
        long sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            System.out.println(sum);

            if (minElement > arr.get(i)) {
                minElement = arr.get(i);
            }

            if (arr.get(i) > maxElement) {
                maxElement = arr.get(i);
            }
        }
        System.out.println((sum - maxElement) + " " + (sum - minElement));
    }

}
