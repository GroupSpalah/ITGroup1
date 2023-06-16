package mihail_chursinov.hw_15_04_23;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class TestCalculator {

    @Mock
    private Calculator mock;
    @Spy
    private Calculator spy;

    @Test
    public void shouldSumMockMethod() {

        Mockito.when(mock.getOperandOne()).thenReturn(12);
        Mockito.when(mock.getOperandTwo()).thenReturn(13);
        Mockito.when(mock.sum()).thenCallRealMethod();

        Assert.assertEquals(mock.sum(), 25);
        //Assert.assertEquals(mock.getOperandOne(),mock.getOperandTwo(), 25);

        Mockito.verify(mock, Mockito.times(1)).sum();
        Mockito.verify(mock, Mockito.times(1)).getOperandOne();
        Mockito.verify(mock, Mockito.times(1)).getOperandTwo();
        Mockito.verifyNoMoreInteractions(mock);
    }

    @Test
    public void shouldSumSpyMethod() {

        Mockito.when(spy.getOperandOne()).thenReturn(12);
        Mockito.when(spy.getOperandTwo()).thenReturn(13);

        Assert.assertEquals(spy.sum(), 25);

        Mockito.verify(spy, Mockito.times(1)).sum();
        Mockito.verify(spy, Mockito.times(1)).getOperandOne();
        Mockito.verify(spy, Mockito.times(1)).getOperandTwo();
        Mockito.verifyNoMoreInteractions(spy);
    }

    @Test
    public void shouldMinusMockMethod() {

        Mockito.when(mock.getOperandOne()).thenReturn(20);
        Mockito.when(mock.getOperandTwo()).thenReturn(10);
        Mockito.when(mock.minus()).thenCallRealMethod();

        Assert.assertEquals(mock.minus(), 10);

        Mockito.verify(mock, Mockito.times(1)).minus();
        Mockito.verify(mock, Mockito.times(1)).getOperandOne();
        Mockito.verify(mock, Mockito.times(1)).getOperandTwo();
        Mockito.verifyNoMoreInteractions(mock);
    }

    @Test
    public void shouldMinusSpyMethod() {

        Mockito.when(spy.getOperandOne()).thenReturn(20);
        Mockito.when(spy.getOperandTwo()).thenReturn(10);

        Assert.assertEquals(spy.minus(), 10);

        Mockito.verify(spy, Mockito.times(1)).minus();
        Mockito.verify(spy, Mockito.times(1)).getOperandOne();
        Mockito.verify(spy, Mockito.times(1)).getOperandTwo();
        Mockito.verifyNoMoreInteractions(spy);
    }

    @Test
    public void shouldMultiplicationMockMethod() {

        Mockito.when(mock.getOperandOne()).thenReturn(5);
        Mockito.when(mock.getOperandTwo()).thenReturn(6);
        Mockito.when(mock.multiplication()).thenCallRealMethod();

        Assert.assertEquals(mock.multiplication(), 30);

        Mockito.verify(mock, Mockito.times(1)).multiplication();
        Mockito.verify(mock, Mockito.times(1)).getOperandOne();
        Mockito.verify(mock, Mockito.times(1)).getOperandTwo();
        Mockito.verifyNoMoreInteractions(mock);
    }

    @Test
    public void shouldMultiplicationSpyMethod() {

        Mockito.when(spy.getOperandOne()).thenReturn(5);
        Mockito.when(spy.getOperandTwo()).thenReturn(6);

        Assert.assertEquals(spy.multiplication(), 30);

        Mockito.verify(spy, Mockito.times(1)).multiplication();
        Mockito.verify(spy, Mockito.times(1)).getOperandOne();
        Mockito.verify(spy, Mockito.times(1)).getOperandTwo();
        Mockito.verifyNoMoreInteractions(spy);
    }

    @Test
    public void shouldDivideMockMethod() {
        Mockito.when(mock.getOperandOne()).thenReturn(15);
        Mockito.when(mock.getOperandTwo()).thenReturn(5);
        Mockito.when(mock.divide()).thenCallRealMethod();

        Assert.assertEquals(mock.divide(), 3);

        Mockito.verify(mock, Mockito.times(1)).getOperandOne();
        Mockito.verify(mock, Mockito.times(1)).getOperandTwo();
        Mockito.verify(mock, Mockito.times(1)).divide();
        Mockito.verifyNoMoreInteractions(mock);
    }

    @Test
    public void shouldDivideSpyMethod() {
        Mockito.when(spy.getOperandOne()).thenReturn(15);
        Mockito.when(spy.getOperandTwo()).thenReturn(5);

        Assert.assertEquals(spy.divide(), 3);

        Mockito.verify(spy, Mockito.times(1)).divide();
        Mockito.verify(spy, Mockito.times(1)).getOperandOne();
        Mockito.verify(spy, Mockito.times(1)).getOperandTwo();
        Mockito.verifyNoMoreInteractions(spy);

    }

    @Test
    public void shouldDivisionWithoutRemainderMockMethod() {
        Mockito.when(mock.getOperandOne()).thenReturn(35);
        Mockito.when(mock.getOperandTwo()).thenReturn(8);
        Mockito.when(mock.divisionWithoutRemainder()).thenCallRealMethod();

        Assert.assertEquals(mock.divisionWithoutRemainder(), 3);

        Mockito.verify(mock, Mockito.times(1)).getOperandOne();
        Mockito.verify(mock, Mockito.times(1)).getOperandTwo();
        Mockito.verify(mock, Mockito.times(1)).divisionWithoutRemainder();
        Mockito.verifyNoMoreInteractions(mock);
    }

    @Test
    public void shouldDivisionWithoutRemainderSpyMethod() {
        Mockito.when(spy.getOperandOne()).thenReturn(35);
        Mockito.when(spy.getOperandTwo()).thenReturn(8);

        Assert.assertEquals(spy.divisionWithoutRemainder(), 3);

        Mockito.verify(spy, Mockito.times(1)).divisionWithoutRemainder();
        Mockito.verify(spy, Mockito.times(1)).getOperandOne();
        Mockito.verify(spy, Mockito.times(1)).getOperandTwo();
        Mockito.verifyNoMoreInteractions(spy);

    }
}
