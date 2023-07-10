package lessons.ls_03_23.ls_18_03_23;

public class LearnStatic {
    public static void main(String[] args) {
        //array of GameSoldier

//        GameSoldier soldier1 = new GameSoldier();

//        soldier1.countAlive = 15;

//        GameSoldier soldier2 = new GameSoldier();

//        System.out.println(soldier2.countAlive);

        /*GameSoldier.countAlive = 15;

        System.out.println(GameSoldier.countAlive);*/

        GameSoldier.setCountAlive(15);

        int countAlive = GameSoldier.getCountAlive();
    }
}

class GameSoldier {
    public int age;
    private static int countAlive;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        setCountAlive(56);
        this.age = age;
    }

    public static int getCountAlive() {
//        this.setAge(89);
        return countAlive;
    }

    public static void setCountAlive(int countAlive) {
        GameSoldier.countAlive = countAlive;
    }

    /*public static void main(String[] args) {
        GameSoldier soldier1 = new GameSoldier();

        soldier1.age = 45;

    }*/
}
