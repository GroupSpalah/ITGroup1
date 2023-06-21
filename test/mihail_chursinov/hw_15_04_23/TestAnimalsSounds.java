package mihail_chursinov.hw_15_04_23;

import homeworks.mihail_chursinov.hw_04_23.hw_15_04_23.AnimalsSounds;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class TestAnimalsSounds {

    @Mock
    private AnimalsSounds mock;


    @Test
    public void shouldCowSoundMethod() {
        Mockito.when(mock.cowSound()).thenReturn("Mu");
        Assert.assertTrue(mock.cowSound().contains("Mu"));

        Mockito.verify(mock, Mockito.times(1)).cowSound();
        Mockito.verifyNoMoreInteractions(mock);

    }

    @Test
    public void shouldCatSoundMethod() {
        Mockito.when(mock.catSound()).thenReturn("Meow");
        Assert.assertTrue(mock.catSound().contains("Meow"));

        Mockito.verify(mock, Mockito.times(1)).catSound();
        Mockito.verifyNoMoreInteractions(mock);

    }

    @Test
    public void shouldMouseSoundMethod() {
        Mockito.when(mock.mouseSound()).thenReturn("Pi");
        Assert.assertTrue(mock.mouseSound().contains("Pi"));

        Mockito.verify(mock, Mockito.times(1)).mouseSound();
        Mockito.verifyNoMoreInteractions(mock);

    }
}
