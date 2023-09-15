package lessons.ls_09_23.ls_15_09_23;

public enum ConstructionType {
    DOMESTIC_HOUSE(10000),
    BLOCK_OF_FLAT(2000),
    OFFICE_BUILDING(6000);

    private int constructionTime;

    ConstructionType(int constructionTime) {
        this.constructionTime = constructionTime;
    }

    public int getConstructionTime() {
        return constructionTime;
    }
}
