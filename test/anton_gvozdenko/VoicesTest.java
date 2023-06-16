package anton_gvozdenko;

import homeworks.anton_gvozdenko.hw_15_04_23.AnimalVoices;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class VoicesTest {
    @Mock
    private AnimalVoices mock;

    @Test
    public void shouldGetCowVoice() {
        Mockito.when(mock.getCow()).thenReturn("Muuu");
        Assert.assertEquals(mock.getCow(), "Muuu");
        Mockito.verify(mock, Mockito.times(1)).getCow();
        Mockito.verifyNoMoreInteractions(mock);
    }

    @Test

    public void shouldGetMouseVoice() {
        Mockito.when(mock.getMouse()).thenReturn("Pi");
        Assert.assertEquals(mock.getMouse(), "Pi");
        Mockito.verify(mock, Mockito.times(1)).getMouse();
        Mockito.verifyNoMoreInteractions(mock);
    }

    @Test
    public void shouldGetCatVoice() {
        Mockito.when(mock.getCat()).thenReturn("Mrrr");
        Assert.assertEquals(mock.getCat(), "Mrrr");
        Mockito.verify(mock, Mockito.times(1)).getCat();
        Mockito.verifyNoMoreInteractions(mock);
    }
}
