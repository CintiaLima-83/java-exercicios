package com.ebac.fatorial;

public class FatorialCalc {

    public FatorialCalc(int n){

        int resultadoFatorial = fatorialRecursao(n);
        System.out.println("O fatorial de " + n + " é: " + resultadoFatorial);
    }

    private static int fatorialRecursao(int n) {
        if (n <= 1)
            return 1;

        return n * fatorialRecursao(n-1);
    }
}
