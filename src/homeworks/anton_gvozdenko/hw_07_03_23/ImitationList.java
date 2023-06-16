package homeworks.anton_gvozdenko.hw_07_03_23;

public class ImitationList {
    private int[] list;

    public ImitationList(int size) {//10
        list = new int[size];
    }

    public void add(int value) {//8
        resize();

        for (int i = 0; i < list.length; i++) {//8 0 0 0 0 0 0
            if (list[i] == 0) {
                list[i] = value;
                break;
            }
        }
    }

    private void resize() {
        if (list[list.length - 1] != 0) {
            int[] temp = new int[list.length * 2];//20

            for (int i = 0; i < list.length; i++) {
                temp[i] = list[i];
            }

            list = temp;
        }

    }

    public void print() {
        for (int e : list) {
            System.out.print(e + "\t");
        }
    }

    public void increase(int element) {

        if (element < 0) {
            System.out.println("Negative value");
        } else if (list[list.length - 1] != 0) {
            int[] array = new int[list.length + element];
            for (int i = 0; i < list.length; i++) {
                array[i] = list[i];
            }
            list = array;
        }

    }

    public void decrease(int element) {
        if (element < 0) {
            System.out.println("Negative value");
        } else if (element > list.length) {
            System.out.println("element more than length");
        } else if (list[list.length - 1] != 0) {
            int[] array = new int[list.length - element];
            for (int i = 0; i < list.length; i++) {
                array[i] = list[i];
            }
            list = array;
        }
    }
}

class TestList {
    public static void main(String[] args) {
        ImitationList obj = new ImitationList(10);

        obj.add(8);
        obj.add(5);
        obj.add(6);
        obj.print();

        obj.decrease(2);
        obj.print();

    }
}

