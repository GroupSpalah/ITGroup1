package mihail_chursinov.hw_11_04_23;

import homeworks.mihail_chursinov.hw_07_03_23.ImitationList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class TestRuleClass {

    private ImitationList list = new ImitationList(3);

    @Before
    public void clearArray() {
        list.setList(new int[3]);
    }

    @Rule
    public SystemOutRule outRule = new SystemOutRule().enableLog();

    @Test
    public void shouldIncreaseWhenValueIsLessThanZero() {
        list.add(8);
        list.add(2);
        list.add(1);
        list.increase(-2);

        String log = outRule.getLog();
        Assert.assertTrue(log.contains("Negative addition number!"));
    }

    @Test
    public void shouldReductionWhenValueIsLessThanZero() {
        list.add(8);
        list.add(2);
        list.add(1);
        list.reduction(-2);

        String log = outRule.getLog();
        Assert.assertTrue(log.contains("Negative addition number!"));
    }

    @Test
    public void shouldReductionWhenIndexIsGreaterThanTheSizeOfTheArray() {
        list.add(8);
        list.add(2);
        list.add(1);
        list.reduction(11);

        String log = outRule.getLog();
        Assert.assertTrue(log.contains("Parameter is greater than the given array!"));
    }

    @Test
    public void shouldOutputArray() {
        list.add(8);
        list.add(2);
        list.add(1);
        list.outputArray();

        String log = outRule.getLog();
        Assert.assertTrue(log.contains("8\t2\t1\t"));
    }

    @Test
    public void shouldOutputArrayBack() {
        list.add(8);
        list.add(2);
        list.add(1);
        list.outputArrayBack();

        String log = outRule.getLog();
        Assert.assertTrue(log.contains("1\t2\t8\t"));
    }

    @Test
    public void shouldRemoveElementByIndexWhenIndexIsGreaterThanTheSizeOfTheArray() {
        list.add(8);
        list.add(2);
        list.add(1);
        list.removeElementByIndex(4);

        String log = outRule.getLog();
        Assert.assertTrue(log.contains("Error! Index is greater than the size of the array."));
    }

    @Test
    public void shouldChangeElementByIndexWhenIndexIsGreaterThanTheSizeOfTheArray() {
        list.add(8);
        list.add(2);
        list.add(1);
        list.changeElementByIndex(5, 6);

        String log = outRule.getLog();
        Assert.assertTrue(log.contains("Error! Index is greater than the size of the array."));
    }

    @Test
    public void shouldChangeElementByIndexWhenValueІsEqualToZero() {
        list.add(8);
        list.add(2);
        list.add(1);
        list.changeElementByIndex(2, 0);

        String log = outRule.getLog();
        Assert.assertTrue(log.contains("Error! Zero cannot be added"));
    }
}
