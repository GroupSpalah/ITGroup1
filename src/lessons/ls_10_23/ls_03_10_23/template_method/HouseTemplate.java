package lessons.ls_10_23.ls_03_10_23.template_method;

public abstract class HouseTemplate {
    private void buildWindows() {
        System.out.println("Build windows");
    }
    private void buildFoundation() {
        System.out.println("Build foundation");
    }

    public abstract void buildWalls();
    public abstract void buildPillars();

    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built");
    }
}

class WoodHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Build wood walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Build wood pillars");
    }
}

class TestHouse {
    public static void main(String[] args) {
        HouseTemplate woodHouse = new WoodHouse();

        woodHouse.buildHouse();
    }
}
