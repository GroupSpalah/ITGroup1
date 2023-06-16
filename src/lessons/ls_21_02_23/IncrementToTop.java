package lessons.ls_21_02_23;

public class IncrementToTop {
    public static void main(String[] args) {

        int[] array = {4, 10, 4};//12

        int max = 10;

        int countSteps = 0;

        for (int i = 0; i < array.length; i++) {//max = 10

            int temp = array[i];//4
//            array[i] = ++array[i];
//++array[i]
            while (temp != max) {
                ++countSteps;
                ++temp;
            }
        }

        System.out.println(countSteps);

    }
}
