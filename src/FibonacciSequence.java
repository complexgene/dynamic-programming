import java.util.HashMap;

public class FibonacciSequence {
    static HashMap<Integer, Long> fib = new HashMap<>();
    public static void main(String[] args) {
        System.out.println(fib(20));
    }

    public static long fib(int n) {
        if (n <= 2) return 1;
        if (fib.containsKey(n)) return fib.get(n);
        long result = fib(n-1) + fib(n-2);
        fib.put(n, result);
        return fib.get(n);
    }
}
