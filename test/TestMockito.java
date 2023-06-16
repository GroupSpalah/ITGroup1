import lessons.ls_11_04_23.CalculatorMockito;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestMockito {

    @Mock
    private CalculatorMockito mock;

    @Spy
    private CalculatorMockito spy;

    @Test
    public void shouldMockMethod() {
//        CalculatorMockito mock = Mockito.mock(CalculatorMockito.class);

        Mockito.when(mock.getRandom()).thenReturn(10);
        Mockito.when(mock.sum(ArgumentMatchers.anyInt())).thenCallRealMethod();

        Assert.assertEquals(mock.sum(9), 19);
    }

    @Test
    public void shouldSpyMethod() {

        Mockito.when(spy.getRandom()).thenReturn(10);

        Assert.assertEquals(spy.sum(8), 18);
    }

    @Test
    public void shouldVerifyMethod() {

        Mockito.when(spy.getRandom()).thenReturn(10);

        Assert.assertEquals(spy.sum(8), 18);

        Mockito.verify(spy, Mockito.times(1)).getRandom();
//        Mockito.verify(spy, Mockito.times(1)).print();
        Mockito.verify(spy, Mockito.times(1)).sum(ArgumentMatchers.anyInt());
        Mockito.verifyNoMoreInteractions(spy);
    }
}
