import lessons.ls_08_04_23.Calculator;
import org.junit.*;

public class CalculatorTest {

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Before all tests");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("After all tests");
    }

    @Before
    public void beforeEachTest() {
        System.out.println("Before each test");
    }

    @After
    public void afterEachTest() {
        System.out.println("After each test");
    }

    @Test
    public void shouldReturnSumValues() {
        Calculator calculator = new Calculator();

        int actualResult = calculator.sum(7, 4);

        Assert.assertEquals("Should return 11", 11, actualResult);
    }

    @Test
    public void shouldReturnSumValues1() {
        Calculator calculator = new Calculator();

        int actualResult = calculator.sum(7, 4);

        Assert.assertEquals("Should return 11", 11, actualResult);
    }
}
