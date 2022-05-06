import java.util.HashSet;
import java.util.Set;

public class RunningKangaroo {

    private static int MAX = Integer.MAX_VALUE;

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x2 > x1 && v2 > v1) {
            return "NO";
        }

        final Set<Integer> firstKangaroo = getFirstKangarooNextPoint(x1, v1);
        final Set<Integer> secondKangaroo = getSecondKangarooNextPoint(x2, v2);

        firstKangaroo.retainAll(secondKangaroo);

        if (firstKangaroo.size() > 0) {
            return "YES";
        }

        return "NO";
    }

    private static Set<Integer> getFirstKangarooNextPoint(int x1, int v1) {
        final Set<Integer> firstKangaroo = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < MAX; i++) {
            sum = x1 + v1;
            firstKangaroo.add(sum);
            x1 = sum;
        }
        return firstKangaroo;
    }

    private static Set<Integer> getSecondKangarooNextPoint(int x2, int v2) {
        final Set<Integer> secondKangaroo = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < MAX; i++) {
            sum = x2 + v2;
            secondKangaroo.add(sum);
            x2 = sum;
        }
        return secondKangaroo;
    }
}
