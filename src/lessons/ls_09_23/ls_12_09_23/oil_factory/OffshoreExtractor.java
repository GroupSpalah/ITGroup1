package lessons.ls_09_23.ls_12_09_23.oil_factory;

import java.util.ArrayList;
import java.util.List;

public class OffshoreExtractor extends Extractor {
    private List<Worker> workers;

    public OffshoreExtractor(String serialNumber, float intendedCapacity, float actualCapacity) {
        super(serialNumber, intendedCapacity, actualCapacity);
        this.workers = new ArrayList<>();
    }

    private void checkError() {
        boolean checkConditions = workers
                .stream()
                .anyMatch(worker -> worker.position() == Position.MEDIC && worker.numberDays() > 14);

        Status status = (getActualCapacity() < getIntendedCapacity() * 0.7) || !checkConditions ?
                Status.ERROR :
                Status.WORKING;

        setStatus(status);
    }
}
