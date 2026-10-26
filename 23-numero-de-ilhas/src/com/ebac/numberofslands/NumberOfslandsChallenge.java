package com.ebac.numberofslands;

import java.util.Scanner;

/*
Um grupo conectado de números 1 na matriz forma uma linha. A matriz tem 5 ilhas.
(0) [1, 1, 0, 0, 0],
(1) [0, 1, 0, 0, 1],
(2) [1, 0, 0, 1, 1],
(3) [0, 0, 0, 0, 0],
(4) [1, 0, 1, 0, 1]]
*/
public class NumberOfslandsChallenge {

    public NumberOfslandsChallenge() {

        int[][] mapa = montaMapa();
        //A partir daqui o mapa da linha já foi mantado pelo usúario.
        System.out.println();
        exibeMapa(mapa);
        System.out.println();

        int numeroDeIlhas = 0;

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {

                //Encontrou uma ilha
                if(mapa[i][j] == 1){
                     numeroDeIlhas++;
                     zeraVizinhos(mapa, i, j);

                }
            }
        }
    }

    private void zeraVizinhos(int[][] mapa, int i, int j) {

        if (j >= mapa[0].length || i >= mapa.length || j < 0 || i < 0 || mapa[i][j] == 0)
            return;

        mapa[i][j] = 0;

        zeraVizinhos(mapa, i, j + 1); //direita
        zeraVizinhos(mapa, i, j - 1); //esquerda
        zeraVizinhos(mapa, i+1, j); //baixo
        zeraVizinhos(mapa, i-1, j); //cima
        zeraVizinhos(mapa, i+1, j-1); //diagonal esquerda
        zeraVizinhos(mapa,i+1, j+1); //diagonal direita

    }

    private int[][] montaMapa(){

        System.out.print("Bem vindo ao cálculo de ilhas do seu mapa. Monte sua ilha digitando 1 para terra firme e 0 para mar.\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Pra começar, digite a quantidade de elementos para as colunas:");
        int i = sc.nextInt();

        System.out.print("Digite a quantidade de elementos para as linhas:");
        int j = sc.nextInt();

        int[][] mapaDeIlhas = new int[i][j];
        for (int x = 0; x < mapaDeIlhas.length; x++) {
            for (int y = 0; y < mapaDeIlhas[0].length; y++) {

                System.out.print("Digite o elemento [" + x + ", " + y + "]:");

                int localDeTerraDoMar = - 1;
                while (localDeTerraDoMar < 0 || localDeTerraDoMar > 1) {
                    localDeTerraDoMar = sc.nextInt();

                    mensagemEntradaValida(localDeTerraDoMar, x, y);
                }
                mapaDeIlhas[x][y] = localDeTerraDoMar;
            }
        }
        return  mapaDeIlhas;
    }

    private void mensagemEntradaValida(int entrada, int x, int y) {
        if(isEntradaValida(entrada))
            System.out.println("Voê digitou uma entrada inválida. Digite 0 ou 1 para o elemento ["+ x + ", " + y + "]:");
    }

    private boolean isEntradaValida(int entrada) {
        return entrada < -1 || entrada > 1;
    }

    private void exibeMapa(int[][] mapa){
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {
                System.out.print(mapa[i][j] + "");
            }
            System.out.println();
        }
    }
}
