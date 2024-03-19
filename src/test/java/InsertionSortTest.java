import org.example.InsertionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertionSortTest {

    @Test
    public void testSort() {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = {5, 2, 4, 6, 1, 3};
        int[] sortedArr = insertionSort.sort(arr.clone());
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, sortedArr);
    }

    @Test
    public void testGetTrocas() {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = {5, 2, 4, 6, 1, 3};
        insertionSort.sort(arr.clone());
        assertEquals(9, insertionSort.getTrocas());
    }
}
