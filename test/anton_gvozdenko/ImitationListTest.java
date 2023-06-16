package anton_gvozdenko;

import homeworks.anton_gvozdenko.hw_11_03_23.ImitationList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ImitationListTest {
    private ImitationList list = new ImitationList(3);

    @Before
    public void clearArray() {
        list.setList(new int[3]);
    }

    @Test
    public void shouldAddElementToArray() {
        list.add(8);
        list.add(7);
        list.add(0);


        int[] array = list.getList();
        Assert.assertArrayEquals(array, new int[]{8, 7, 0});
    }

    @Test
    public void shouldDeleteElementByIndex() {
        list.add(2);
        list.add(3);
        list.add(4);
        list.removeElementByIndex(0);
        int[] array = list.getList();
        Assert.assertArrayEquals(array, new int[]{3, 4});

    }

    @Test
    public void shouldDeleteDuplicatesWhenListIsCorrect() {
        list.add(1);
        list.add(2);
        list.add(2);
        list.deleteDuplicates();
        int[] array = list.getList();
        Assert.assertArrayEquals(array, new int[]{1, 2});
    }

    @Test
    public void shouldAdValueAndResizeArray() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(4);


        int[] array = list.getList();
        Assert.assertArrayEquals(array, new int[]{1, 2, 3, 4, 1, 4});
    }

    @Test
    public void shouldSortByBubble() {
        list.add(2);
        list.add(5);
        list.add(1);
        list.bubbleSort(list.getList());
        int[] array = list.getList();
        Assert.assertArrayEquals(array, new int[]{1, 2, 5});
    }

    @Test
    public void shouldAdArrayWhenEIsCorrect() {
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(5);

        list.addArray(new int[]{1, 1});
        int[] array = list.getList();
        Assert.assertArrayEquals(array, new int[]{2, 4, 1, 5, 1, 1});

    }
}