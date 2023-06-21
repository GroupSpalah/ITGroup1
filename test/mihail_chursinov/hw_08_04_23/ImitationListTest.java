package mihail_chursinov.hw_08_04_23;

import homeworks.mihail_chursinov.hw_03_23.hw_07_03_23.ImitationList;
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
    public void shouldRemoveElementByIndexWhenIndexIsCorrect() {
        list.add(8);
        list.add(6);
        list.add(5);


        list.removeElementByIndex(0);
        int[] array = list.getList();

        Assert.assertArrayEquals(array, new int[]{6, 5});
    }

    @Test
    public void shouldRemoveElementByIndexWhenIndexIsGreaterThanTheSizeOfTheArray() {
        list.add(8);
        list.add(6);
        list.add(5);


        list.removeElementByIndex(4);
        int[] array = list.getList();

        Assert.assertArrayEquals(array, new int[]{8, 6, 5});
    }

    @Test
    public void shouldDeleteDuplicatesWhenThereAreDuplicates() {
        list.add(8);
        list.add(5);
        list.add(5);

        list.deleteDuplicates();
        int[] array = list.getList();

        Assert.assertArrayEquals(array, new int[]{8, 5});
    }


    @Test
    public void shouldDeleteDuplicatesWhenThereIsNoDuplicates() {
        list.add(8);
        list.add(6);
        list.add(5);

        list.deleteDuplicates();
        int[] array = list.getList();

        Assert.assertArrayEquals(array, new int[]{8, 6, 5});
    }

    @Test
    public void shouldResizeArray() {
        list.add(8);
        list.add(5);
        list.add(5);
        list.add(4);


        int[] array = list.getList();

        Assert.assertArrayEquals(array, new int[]{8, 5, 5, 4, 0, 0});

    }

    @Test
    public void shouldBubbleSort() {
        list.add(8);
        list.add(2);
        list.add(1);

        list.bubbleSort();
        int[] array = list.getList();

        Assert.assertArrayEquals(array, new int[]{1, 2, 8});

    }
}
