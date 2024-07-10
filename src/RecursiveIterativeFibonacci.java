public class RecursiveIterativeFibonacci {
    public static int fibonacciRecursive(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static int fibonacciIterative(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int fibMinus2 = 0;
            int fibMinus1 = 1;
            int fib = 0;

            for (int i = 2; i <= n; i++) {
                fib = fibMinus1 + fibMinus2;
                fibMinus2 = fibMinus1;
                fibMinus1 = fib;
            }

            return fib;
        }
    }

    public static void main(String[] args) {
        int n = 6; 
        int fibRec = fibonacciRecursive(n);
        System.out.println("Fibonacci number at position " + n + " (Recursive): " + fibRec);

        int fibIter = fibonacciIterative(n);
        System.out.println("Fibonacci number at position " + n + " (Iterative): " + fibIter);
    }
}
