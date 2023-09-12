package lessons.ls_09_23.ls_12_09_23.oil_factory;

public class TerrestrialExtractor extends Extractor {
    private String location;

    public TerrestrialExtractor(String serialNumber, float intendedCapacity,
                                float actualCapacity, String location) {
        super(serialNumber, intendedCapacity, actualCapacity);
        this.location = location;
    }
}
