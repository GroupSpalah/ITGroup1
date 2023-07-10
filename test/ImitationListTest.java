import lessons.ls_03_23.ls_14_03_23.ImitationList;
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

        int[] array = list.getList();// 8 7 0

       /* Assert.assertEquals(array[0], 8);
        Assert.assertEquals(array[1], 7);*/
        Assert.assertArrayEquals(array, new int[]{8, 7, 0});

    }

    @Test
    public void shouldChangeElementByIndexWhenIndexAndValueAreCorrect() {
        list.add(8);
        list.add(7);

        list.changeElementByIndex(0, 6);

        int[] array = list.getList();// 6 7 0

        Assert.assertArrayEquals(array, new int[]{6, 7, 0});

    }

    @Test
    public void shouldChangeElementByIndexWhenIndexNotCorrectValueIsCorrect() {
        list.add(8);
        list.add(7);

        list.changeElementByIndex(-1, 6);

        int[] array = list.getList();// 6 7 0

        Assert.assertArrayEquals(array, new int[]{8, 7, 0});

    }
}
