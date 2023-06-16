package homeworks.anton_gvozdenko.hw_11_03_23;

public class ImitationList {
    public int[] list;

    public ImitationList(int size) {
        list = new int[size];
    }

    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }

    public void add(int value) {
        resize();

        for (int i = 0; i < list.length; i++) {
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
        } else {
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
        } else {
            int[] array = new int[list.length - element];
            for (int i = 0; i < list.length; i++) {

            }
            list = array;
        }
    }

    public ImitationList addValue(int value) {

        for (int i = 0; i < list.length; i++) {
            if (list[i] == 0) {
                list[i] = value;
                break;
            }
        }
        return this;
    }

    public int reverse() {
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + "  ");
        }
        return 0;
    }

    public void findIndex(int value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) {
                System.out.println(i);
                break;
            }
        }

    }

    public void changeValue(int index, int value) {
        for (int i = 0; i < list.length; i++) {
            i = index;
            if (index <= 0 && index < list.length - 1) {
                System.out.println("Index can't be less by zero and by list length");
                return;
            }
            list[i] = value;
            if (value == 0) {
                System.out.println(" Value can't be a zero");
            }

            return;
        }

    }

    public void bubbleSort(int list[]) {
        for (int i = 0; i < list.length - 1; ++i)
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
    }

    public void removeElementByIndex(int index) {
        if (index < 0 && index > list.length - 1) {
            System.out.println("Index can't be less by zero and by list length");
            return;
        }
        int[] temp = new int[list.length -1];
        for (int i = 0; i < index; i++) {
            temp[i] = list[i];
        }
        for (int i = index; i < list.length - 1; i++) {
            temp[i] = list[i + 1];
        }

        list = temp;
    }

    public void deleteDuplicates() {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    removeElementByIndex(i);
                    --j;
                }
            }
        }
    }

    public void addArray(int[] array) {

        int countZeros = 0;

        for (int e : list) {
            if (e == 0) {
                ++countZeros;
            }
        }

        int positionFirstZero = list.length - countZeros;

        if (countZeros < array.length) {
            int value = array.length - countZeros;

        }

        for (int i = positionFirstZero, j = 0; i < list.length; i++) {
            list[i] = array[j];
        }
    }
}

class TestList {
    public static void main(String[] args) {
        ImitationList obj = new ImitationList(10);

        obj.add(8);
        obj.add(5);
        obj.add(6);
        obj.add(3);
        obj.add(4);
        obj.add(1);
        obj.print();

        obj.increase(5);
        System.out.println();
        obj.print();
        obj.decrease(2);
        System.out.println();
        obj.addValue(5)
                .addValue(5)
                .addValue(3).
                addValue(4)
                .addValue(6)
                .addValue(8)
                .addValue(3)
                .addValue(1)
                .addValue(2)
                .addValue(3)
                .addValue(4)
                .addValue(5);
        obj.print();
        System.out.println();
        obj.reverse();
        System.out.println();
        obj.findIndex(3);

        obj.changeValue(5, 9);
        obj.print();
        obj.bubbleSort(obj.list);
        System.out.println();
obj.removeElementByIndex(0);
        obj.print();
        obj.deleteDuplicates();
    }
}



