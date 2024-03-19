package org.example;

public class BubbleSort {
    private int trocas;
    private int comparacoes;
    private long tempoExecucao;

    public BubbleSort() {
        this.trocas = 0;
        this.comparacoes = 0;
        this.tempoExecucao = 0;
    }

    public int[] sort(int[] arr) {
        long startTime = System.nanoTime();

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparacoes++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    trocas++;
                }
            }
        }

        long endTime = System.nanoTime();
        tempoExecucao = endTime - startTime;

        return arr;
    }

    public int getTrocas() {
        return trocas;
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public long getTempoExecucao() {
        return tempoExecucao;
    }
}
