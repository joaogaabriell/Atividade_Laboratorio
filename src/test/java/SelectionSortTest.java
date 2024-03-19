import org.example.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectionSortTest {

    @Test
    public void testSort() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {5, 2, 4, 6, 1, 3};
        int[] sortedArr = selectionSort.sort(arr.clone());
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, sortedArr);
    }

    @Test
    public void testGetTrocas() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {5, 2, 4, 6, 1, 3};
        selectionSort.sort(arr.clone());
        assertEquals(5, selectionSort.getTrocas());
    }
}
