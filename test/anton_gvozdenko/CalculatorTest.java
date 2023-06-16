package anton_gvozdenko;

import homeworks.anton_gvozdenko.hw_15_04_23.CalculatorMockito;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {
    @Mock
    private CalculatorMockito mock;
    @Spy
    private CalculatorMockito spy;

    @Test

    public void shouldSumMethod() {
        Mockito.when(mock.getOperandOne()).thenReturn(5);
        Mockito.when(mock.getOperandTwo()).thenReturn(4);
        Mockito.when(mock.getSum()).thenCallRealMethod();
        Assert.assertEquals(mock.getSum(), 9);

        Mockito.verify(mock, Mockito.times(1)).getOperandOne();
        Mockito.verify(mock, Mockito.times(1)).getOperandTwo();
        Mockito.verify(mock, Mockito.times(1)).getSum();
        Mockito.verifyNoMoreInteractions(mock);
    }

    @Test
    public void shouldMinusMethod() {
        Mockito.when(mock.getOperandOne()).thenReturn(15);
        Mockito.when(mock.getOperandTwo()).thenReturn(5);
        Mockito.when(mock.getMinus()).thenCallRealMethod();
        Assert.assertEquals(mock.getMinus(), 10);
        Mockito.verify(mock, Mockito.times(1)).getOperandOne();
        Mockito.verify(mock, Mockito.times(1)).getOperandTwo();
        Mockito.verify(mock, Mockito.times(1)).getMinus();
        Mockito.verifyNoMoreInteractions(mock);
    }

    @Test
    public void shouldMultiplyMethod() {
        Mockito.when(mock.getOperandOne()).thenReturn(2);
        Mockito.when(mock.getOperandTwo()).thenReturn(3);
        Mockito.when(mock.getMultiply()).thenCallRealMethod();
        Assert.assertEquals(mock.getMultiply(), 6);

        Mockito.verify(mock, Mockito.times(1)).getOperandOne();
        Mockito.verify(mock, Mockito.times(1)).getOperandTwo();
        Mockito.verify(mock, Mockito.times(1)).getMultiply();
        Mockito.verifyNoMoreInteractions(mock);
    }

    @Test
    public void shouldDivideMethod() {
        Mockito.when(mock.getOperandOne()).thenReturn(16);
        Mockito.when(mock.getOperandTwo()).thenReturn(4);
        Mockito.when(mock.getDivide()).thenCallRealMethod();
        Assert.assertEquals(mock.getDivide(), 4);

        Mockito.verify(mock, Mockito.times(1)).getOperandOne();
        Mockito.verify(mock, Mockito.times(1)).getOperandTwo();
        Mockito.verify(mock, Mockito.times(1)).getDivide();

    }


}
