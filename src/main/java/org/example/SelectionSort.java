package org.example;

public class SelectionSort {
    private int trocas;
    private int comparacoes;
    private long tempoExecucao;

    public SelectionSort() {
        this.trocas = 0;
        this.comparacoes = 0;
        this.tempoExecucao = 0;
    }

    public int[] sort(int[] arr) {
        long startTime = System.nanoTime();

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                comparacoes++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            trocas++;
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
