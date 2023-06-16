package homeworks.mihail_chursinov.hw_07_03_23;

import java.util.Arrays;
import java.util.Random;

public class ImitationList {
    /**
     * 3) увеличение длины массива на заданное количество элементов. - Homework
     * 4) уменьшение длины массива до заданного количество элементов.  - Homework
     * Переписать метод add, чтобы мы могли его вызывать через сцепелнный вызов, то есть так:
     * list.add(8)
     * .add(5);
     * 5) вывод элементов в консоль в прямом и обратном порядке.
     * 9) Поиск индекса первого вхождения элемента методом линейного поиска. если массив 4 1 2 3 7 2
     * и мы ищем первое вхождение 2, то надо вернуть индекс на котором впервые встретилась 2,
     * добавить метод в класс ImitationList с помощью нескольких return выражений.
     * 2) изменение элементов по индексу. - Homework
     * 0 1 2 3 4
     * 7 8 5 2 6 - list
     * <p>
     * void method(int index, int value) {
     * //check index, return
     * //check value != 0, Число 0 добавлять нельзя., return
     * //logic
     * 8) удалять дубликаты. - Homework
     * 10) Перемешивание элементов листа в случайном порядке.
     */
    private int[] list;


    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }

    public ImitationList(int size) {//10
        list = new int[size];
    }

    public ImitationList add(int value) {
        resize();

        for (int i = 0; i < list.length; i++) {
            if (list[i] == 0) {
                list[i] = value;
                break;
            }
        }
        return this;
    }

    private void resize() {
        if (list[list.length - 1] != 0) {
            int[] temp = new int[list.length * 2];

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

    public void addArray(int[] array) {

        int countZeros = 0;

        for (int e : list) {
            if (e == 0) {
                ++countZeros;
            }
        }

        int positionFirstZero = list.length - countZeros;

        if (countZeros < array.length) {//8 - 5 = 3
            int value = array.length - countZeros;
            //increaseArray(value);
        }

        for (int i = positionFirstZero, j = 0; i < list.length; i++) {
            list[i] = array[j];
        }
    }

    public void increase(int value) {
        if (value < 0) {
            System.out.println("Negative addition number!");
        } else {
            int[] temp = new int[list.length + value];

            for (int i = 0; i < list.length; i++) {
                temp[i] = list[i];
            }

            list = temp;
        }

    }

    public void reduction(int value) {
        if (value < 0) {
            System.out.println("Negative addition number!");
        } else if (value > list.length) {
            System.out.println("Parameter is greater than the given array!");
        } else {
            int[] temp = new int[list.length - value];

            for (int i = 0; i < temp.length; i++) {
                temp[i] = list[i];
            }

            list = temp;
        }

    }

    public void outputArray() {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

    }

    public void outputArrayBack() {
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + "\t");
        }

    }


    public int findIndex(int target) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                return i;
            }

        }
        return -1;
    }

    public void removeElementByIndex(int index) {
        if (index > list.length) {
            System.out.println("Error! Index is greater than the size of the array.");
            return;
        }

        int[] temp = new int[list.length - 1];

        for (int i = 0; i < index; i++) {
            temp[i] = list[i];
        }

        for (int i = index; i < list.length - 1; i++) {
            temp[i] = list[i + 1];
        }

        list = temp;
    }

    public void changeElementByIndex(int index, int value) {
        if (index > list.length) {
            System.out.println("Error! Index is greater than the size of the array.");
            return;
        } else if (value == 0) {
            System.out.println("Error! Zero cannot be added");
            return;
        }
        for (int i = index; i == index; i++) {
            list[index] = value;
        }
    }

    public void bubbleSort() {
        int n = list.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    System.out.println(Arrays.toString(list));
                }
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

    Random random = new Random();

    public void mixElement() {
        for (int i = list.length - 1; i > 1; i--) {
            int j = random.nextInt(i);

            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }

    }


}

class TestList {
    public static void main(String[] args) {
        ImitationList obj = new ImitationList(10);

        obj.add(8)
                .add(5)
                .add(5)
                .add(3)
                .add(7)
                .add(2);
        //obj.increase(3);
        //obj.reduction(5);
        // obj.outputArray();
//        obj.outputArrayBack();
//        System.out.println(obj.findIndex(6));
        obj.changeElementByIndex(1, 16);
//        obj.bubbleSort();
//        obj.deleteDuplicates();
        // obj.mixElement();

        obj.print();

    }
}
