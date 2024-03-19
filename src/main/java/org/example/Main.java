import org.example.BubbleSort;
import org.example.InsertionSort;
import org.example.SelectionSort;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite a quantidade de elementos a serem gerados (até 1.000.000): ");
        int n = scanner.nextInt();

        if (n <= 0 || n > 1_000_000_000) {
            System.out.println("Digite um número válido entre 1 e 1.000.000.000");
            return;
        }

        int[] arr = generateRandomArray(n, random);

        System.out.println("\nArray original gerado:");
        printArray(arr);

        // Algoritmo Bubble Sort
        BubbleSort bubbleSort = new BubbleSort();
        long startTimeBubble = System.nanoTime();
        int[] sortedBubble = bubbleSort.sort(arr.clone());
        long endTimeBubble = System.nanoTime();
        double bubbleTime = (endTimeBubble - startTimeBubble) / 1e6;
        System.out.println("\nArray ordenado com Bubble Sort:");
        printArray(sortedBubble);
        System.out.println("Número de trocas realizadas com Bubble Sort: " + bubbleSort.getTrocas());
        System.out.println("Número de comparações realizadas com Bubble Sort: " + bubbleSort.getComparacoes());
        System.out.println("Tempo gasto com Bubble Sort: " + bubbleTime + " ms");

        // Algoritmo Selection Sort
        SelectionSort selectionSort = new SelectionSort();
        long startTimeSelection = System.nanoTime();
        int[] sortedSelection = selectionSort.sort(arr.clone());
        long endTimeSelection = System.nanoTime();
        double selectionTime = (endTimeSelection - startTimeSelection) / 1e6;
        System.out.println("\nArray ordenado com Selection Sort:");
        printArray(sortedSelection);
        System.out.println("Número de trocas realizadas com Selection Sort: " + selectionSort.getTrocas());
        System.out.println("Número de comparações realizadas com Selection Sort: " + selectionSort.getComparacoes());
        System.out.println("Tempo gasto com Selection Sort: " + selectionTime + " ms");

        // Algoritmo Insertion Sort
        InsertionSort insertionSort = new InsertionSort();
        long startTimeInsertion = System.nanoTime();
        int[] sortedInsertion = insertionSort.sort(arr.clone());
        long endTimeInsertion = System.nanoTime();
        double insertionTime = (endTimeInsertion - startTimeInsertion) / 1e6;
        System.out.println("\nArray ordenado com Insertion Sort:");
        printArray(sortedInsertion);
        System.out.println("Número de trocas realizadas com Insertion Sort: " + insertionSort.getTrocas());
        System.out.println("Número de comparações realizadas com Insertion Sort: " + insertionSort.getComparacoes());
        System.out.println("Tempo gasto com Insertion Sort: " + insertionTime + " ms");

        // Printa as comparações
        System.out.println("\nComparação de todos os arrays:");
        System.out.println("Bubble Sort:");
        System.out.println("   Número de trocas: " + bubbleSort.getTrocas());
        System.out.println("   Número de comparações: " + bubbleSort.getComparacoes());
        System.out.println("   Tempo gasto: " + bubbleTime + " ms");

        System.out.println("Selection Sort:");
        System.out.println("   Número de trocas: " + selectionSort.getTrocas());
        System.out.println("   Número de comparações: " + selectionSort.getComparacoes());
        System.out.println("   Tempo gasto: " + selectionTime + " ms");

        System.out.println("Insertion Sort:");
        System.out.println("   Número de trocas: " + insertionSort.getTrocas());
        System.out.println("   Número de comparações: " + insertionSort.getComparacoes());
        System.out.println("   Tempo gasto: " + insertionTime + " ms");

        scanner.close();
    }

    public static int[] generateRandomArray(int n, Random random) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(999999999);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
