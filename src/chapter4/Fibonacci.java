package chapter4;

public class Fibonacci {

    public int fibonacciRecur(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacciRecur(n - 1) + fibonacciRecur(n - 2);
    }

    public int fibonacciIter(int n) {

        int pprev = 0;
        int prev = 1;
        int curr = 0;

        if (n == 0) return 0;
        if (n == 1) return 1;

        for (int i = 2; i <= n; i++) {
            curr = prev + pprev;
            pprev = prev;
            prev = curr;
        }

        return curr;
    }

    public int fibonacciMem(int n) {
        int[] val = new int[n + 1];

        val[0] = 0;
        val[1] = 1;

        int i;
        for (i = 2; i <= n; i++) {
            val[i] = val[i - 1] + val[i - 2];
        }

        return val[i - 1];
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int sum = fibonacci.fibonacciRecur(6);
        System.out.println(sum);
        sum = fibonacci.fibonacciIter(6);
        System.out.println(sum);
        sum = fibonacci.fibonacciMem(6);
        System.out.println(sum);
    }
}

