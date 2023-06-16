package anton_gvozdenko;

import homeworks.anton_gvozdenko.hw_11_03_23.ImitationList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class TestRule {
    private ImitationList list = new ImitationList(3);

    @Before
    public void clearArray() {
        list.setList(new int[3]);
    }

    @Rule
    public SystemOutRule outRule = new SystemOutRule().enableLog();

    @Test
    public void shouldPrintConsole() {
        list.add(5);
        list.add(3);
        list.add(1);
        list.print();
        String log = outRule.getLog();
        Assert.assertTrue(log.contains("5\t3\t1\t"));
    }


    @Test
    public void shouldPrintReverse() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.reverse();
        String log = outRule.getLog();
        Assert.assertTrue(log.contains("3  2  1  "));
    }

    @Test
    public void shouldPrintChangesWhenIndexIsNotCorrect() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.changeValue(-1, 5);
        String log = outRule.getLog();
        Assert.assertTrue(log.contains("Index can't be less by zero and by list length"));

    }

    @Test

    public void shouldPrintChangesWhenValueIsNotCorrect() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.changeValue(1, 0);
        String log = outRule.getLog();
        Assert.assertTrue(log.contains("Value can't be a zero"));

    }

    @Test
    public void shouldPrintConsoleWhenElementIsNotCorrect() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.increase(-1);
        String log = outRule.getLog();
        Assert.assertTrue(log.contains("Negative value"));

    }

    @Test
    public void shouldPrintConsoleWithDecreaseMethodWhenElementIsLessByZero() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.decrease(-1);
        String log = outRule.getLog();
        Assert.assertTrue(log.contains("Negative value"));

    }

    @Test
    public void shouldPrintConsoleWithDecreaseMethodWhenElementIsMoreThanLength() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.decrease(6);
        String log = outRule.getLog();
        Assert.assertTrue(log.contains("element more than length"));

    }


}


