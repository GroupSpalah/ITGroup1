package lessons.ls_04_04_23.man_position;

public class Position {
    private String name;

    public Position(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println("Name = " + name);
    }
}
