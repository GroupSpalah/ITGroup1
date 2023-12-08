package homeworks.mihail_chursinov.hw_12_23.hw_05_12_23;

import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.domain.Qualification;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.impl.DriverServiceImpl;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.service.CrudService;

public class TestDriverTruck {
    public static void main(String[] args) {
        CrudService<Driver> driverService = new DriverServiceImpl();

        String name = Qualification.D.name();//"D"

    }
}
