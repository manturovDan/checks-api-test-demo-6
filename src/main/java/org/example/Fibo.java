package org.example;

public class Fibo {
    public static int fibo_recursion(int n) {
        if (n <= 1)
            return n;

        // Recursive call
        return fibo_recursion(n - 1) + fibo_recursion(n - 2);
    }

    public static int fibo_loop(int n) {
        int n1 = 0;
        int n2 = 1;

        for (int i = 0; i < n; ++i) {
            int x = n1+n2;
            n1 = n2;
            n2 = x;
        }

        return n1;
    }
}
