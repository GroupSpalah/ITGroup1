package lessons.ls_09_23.ls_12_09_23.oil_factory;

public class MobileExtractor extends Extractor {
    private String location;

    public MobileExtractor(String serialNumber, float intendedCapacity, float actualCapacity, String location) {
        super(serialNumber, intendedCapacity, actualCapacity);
        this.location = location;
        Status status = actualCapacity < intendedCapacity * 0.25f ? Status.ERROR : Status.WORKING;

        setStatus(status);
    }
}
