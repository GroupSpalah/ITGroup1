import lessons.ls_04_23.ls_08_04_23.Calculator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class TestRuleConsole {

    @Rule
    public SystemOutRule outRule = new SystemOutRule().enableLog();

    @Test
    public void shouldPrintInConsole() {
        new Calculator().print();

        String log = outRule.getLog();

//        Assert.assertEquals(log, "Hello");
        Assert.assertTrue(log.contains("Hello"));
//        Assert.assertTrue(log.contains("3\t4\t8\t"));
    }

}
