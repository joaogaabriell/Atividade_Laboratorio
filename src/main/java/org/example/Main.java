package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int LIMITE_ELEMENTOS = 1_000_000;
    private static final int LIMITE_IMPRESSAO = 100;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            System.out.print("Digite a quantidade de elementos a serem gerados (até 1.000.000): ");
            int n = scanner.nextInt();

            if (n <= 0 || n > LIMITE_ELEMENTOS) {
                System.out.println("Digite um número válido entre 1 e 1.000.000");
                return;
            }

            int[] arr = generateRandomArray(n, random);

            System.out.println("\nArray original gerado:");
            printArray(arr);

            BubbleSort bubbleSort = new BubbleSort();
            int[] sortedBubble = bubbleSort.sort(arr.clone());
            System.out.println("\nArray ordenado com Bubble Sort:");
            printArray(sortedBubble);
            exibirEstatisticas("Bubble Sort", bubbleSort.getTrocas(), bubbleSort.getComparacoes(), bubbleSort.getTempoExecucao());

            SelectionSort selectionSort = new SelectionSort();
            int[] sortedSelection = selectionSort.sort(arr.clone());
            System.out.println("\nArray ordenado com Selection Sort:");
            printArray(sortedSelection);
            exibirEstatisticas("Selection Sort", selectionSort.getTrocas(), selectionSort.getComparacoes(), selectionSort.getTempoExecucao());

            InsertionSort insertionSort = new InsertionSort();
            int[] sortedInsertion = insertionSort.sort(arr.clone());
            System.out.println("\nArray ordenado com Insertion Sort:");
            printArray(sortedInsertion);
            exibirEstatisticas("Insertion Sort", insertionSort.getTrocas(), insertionSort.getComparacoes(), insertionSort.getTempoExecucao());

            System.out.println("\nComparação de todos os algoritmos:");
            exibirEstatisticas("Bubble Sort", bubbleSort.getTrocas(), bubbleSort.getComparacoes(), bubbleSort.getTempoExecucao());
            exibirEstatisticas("Selection Sort", selectionSort.getTrocas(), selectionSort.getComparacoes(), selectionSort.getTempoExecucao());
            exibirEstatisticas("Insertion Sort", insertionSort.getTrocas(), insertionSort.getComparacoes(), insertionSort.getTempoExecucao());
        }
    }

    private static void exibirEstatisticas(String algoritmo, int trocas, int comparacoes, long tempoNanos) {
        System.out.println(algoritmo + ":");
        System.out.println("   Número de trocas: " + trocas);
        System.out.println("   Número de comparações: " + comparacoes);
        System.out.println("   Tempo gasto: " + (tempoNanos / 1e6) + " ms");
    }

    public static int[] generateRandomArray(int n, Random random) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(1_000_000_000);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        if (arr.length > LIMITE_IMPRESSAO) {
            System.out.println("(array com " + arr.length + " elementos — impressão omitida)");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int valor : arr) {
            sb.append(valor).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}
