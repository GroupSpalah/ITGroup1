package lessons.ls_05_23.ls_19_05_23;

public class FindErrors {
    public static void main(String[] args) {

    }
}

class Task implements Actionable {
    public void doIt() {
    }
}
class Run extends Task implements Actionable {

    public void doStuff() {
    }

    /*public void doIt() {
    }*/
}

interface Actionable {

    public void doIt();
}
