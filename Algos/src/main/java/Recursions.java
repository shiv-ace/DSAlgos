public class Recursions {

    public int getFibonacciNumber(int n) {
        if (n <= 1) {
            return n;
        }
        return getFibonacciNumber(n - 2) + getFibonacciNumber(n - 1);
    }

    public int getFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return getFactorial(n - 1) * n;
    }
}
