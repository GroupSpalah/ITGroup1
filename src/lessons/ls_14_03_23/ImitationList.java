package lessons.ls_14_03_23;

public class ImitationList {
    private int[] list;

    public ImitationList(int size) {//10
        list = new int[size];
    }

    //TODO Only for test reasons
    public int[] getList() {
        return list;
    }

    //TODO Only for test reasons
    public void setList(int[] list) {
        this.list = list;
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

    //4 5 6 9 0 0 0 0 0 + 1 2 3 -> 4 5 6 9 1 2 3 0
    public void addArray(int[] array) {//8

        int countZeros = 0;

        for (int e : list) {
            if (e == 0) {
                ++countZeros;//5
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

    /*

    0 1 2 3 4   0 1 2 3
    7 8 5 9 6 - 7 8 9 6
    */

    public void removeElementByIndex(int index) {//2
        //check index

        int[] temp = new int[list.length - 1];//0 0 0 0

        for (int i = 0; i < index; i++) {
            temp[i] = list[i];
        }
        //temp - 7 8 0 0

        for (int i = index; i < list.length - 1; i++) {
            temp[i] = list[i + 1];
        }//7 8 9 6

        list = temp;
    }


    public void changeElementByIndex(int index, int value) {
        if (index < 0 || index > list.length) {
            System.out.println("Type a positive index from 0 to list.length " + list.length);
            return;
        }

        if (value == 0) {
            System.out.println("You cant type the value = 0");
            return;
        }

        list[index] = value;
    }

    //  0 1 2 3 4    0 1 2 3
//  4 5 5 5 9 -> 4 5 5 9
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
}

