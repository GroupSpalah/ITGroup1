package lessons.ls_04_23.ls_04_04_23;

public enum Country {
    CANADA("Canada"),
    UKRAINE("Ukraine"),
    UK("Uk");

    private String shortName;

    Country(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }
}
