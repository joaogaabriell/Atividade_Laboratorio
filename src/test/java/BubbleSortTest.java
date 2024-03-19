import org.example.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {

    @Test
    public void testSort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {5, 2, 4, 6, 1, 3};
        int[] sortedArr = bubbleSort.sort(arr.clone());
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, sortedArr);
    }

    @Test
    public void testGetTrocas() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {5, 2, 4, 6, 1, 3};
        bubbleSort.sort(arr.clone());
        assertEquals(9, bubbleSort.getTrocas());
    }
}
