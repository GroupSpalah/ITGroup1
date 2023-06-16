package lessons.ls_01_23.ls_31_01_23;

public class IncrementDecrement {
    public static void main(String[] args) {
        int count = 2;

        /*count = count + 1;

        count += 1;

        ++count;//preincrement
        count++;//postincrement

        --count;//predecrement
        count--;//postdecrement

        */

//        System.out.println(count++);
//        System.out.println(++count);
//        System.out.println(count);

        int result = (count++) + (--count) + (count++);//2 + 4 + 4
        System.out.println(result);
    }
}
