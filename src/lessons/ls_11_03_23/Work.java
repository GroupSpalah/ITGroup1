package lessons.ls_11_03_23;

public class Work {
    public int action(int value) {//8
        if (value < 0) {
            System.out.println("Value < 0");
            return 0;
        } else if (value == 0) {
            return 5;
        } else {
            return 3;
        }

//        return 5;
    }

    public int action1(int value) {
        if (value < 0) {
            System.out.println("Value < 0");
//            return 0;
        } else if (value == 0) {
//            return 5;
        }
        return 3;
    }

    public void action2(int value) {
        if (value < 0) {
            System.out.println("Value < 0");
            return;
        } else {
            //complex logic
        }

    }

    public void action3(int value) {
        if (value < 0) {
            System.out.println("Value < 0");
            return;
        }

        //complex logic
        value += 1;

    }
}
