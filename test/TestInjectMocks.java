import lessons.ls_04_23.ls_15_04_23.inject_mocks.Car;
import lessons.ls_04_23.ls_15_04_23.inject_mocks.Engine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestInjectMocks {

    @Mock
    private Engine engine;

    @InjectMocks
    private Car car;

    @Test
    public void shoudInjectMocks() {
        Mockito.when(engine.getNumberCylindres()).thenReturn(8);

        car.action();
    }
}
