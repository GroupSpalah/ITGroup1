package homeworks.mihail_chursinov.hw_04_23.hw_04_04_23;

public enum Sex {
    MALE("male"),
    FEMALE("female");

    private String shortName;

    Sex(String shortName) {
        this.shortName = shortName;
    }

    public void showInfoSex() {
        System.out.println("Sex:" + "\t" + shortName);
    }
}


