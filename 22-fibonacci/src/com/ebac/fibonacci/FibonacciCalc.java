package com.ebac.fibonacci;

import java.util.HashMap;

public class FibonacciCalc {


        public FibonacciCalc(int n){

            int fib = fibRecursao(n);
            System.out.println("O Fibonacci da posição " + n + " é " + fib);

        }

        private int fibRecursao(int n){
            if (n < 2)
                return n;

            return fibRecursao(n-1) + fibRecursao(n-2);

        }
    }
