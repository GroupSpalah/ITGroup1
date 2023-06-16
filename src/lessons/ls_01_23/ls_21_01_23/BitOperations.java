package lessons.ls_01_23.ls_21_01_23;

public class BitOperations {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(47));//00101111
        System.out.println(Integer.toBinaryString(19));//00010011
        System.out.println("47 & 19 = " + (47 & 19));    // 00000011, bit AND
        System.out.println("47 | 19 = " + (47 | 19));    // 00111111, bit OR
        System.out.println("19 << 2 = " + (19 << 2));    // left shift << 00010011 -> 01001100
        System.out.println("19 >> 2 = " + (19 >> 2));    // right shift >> 00010011 -> 00000100

        /*
        * 19 * 2(2) = 76, left shift
        * 19 / 2(2) = 4, left shift
        * */

//        System.out.println((int) Math.pow(2, 7));
//        System.out.println(1 << 7);// 1 * 2(7)
    }

}

/**
 * 135(10 cc) -> 10000111(2cc)
 * 135 / 2 = 67, ost - 1
 * 67 / 2 = 33, ost - 1
 * 33 / 2 = 16, ost - 1
 * 16 / 2 = 8, ost - 0
 * 8 / 2 = 4, ost - 0
 * 4 / 2 = 2, ost - 0
 * 2 / 2 = 1, ost - 0
 *
 * 76543210
 * 10000111(2cc) - 1 * 2(7) + 0 * 2(6) + 0 * 2(5) + 0 * 2(4) + 0 * 2(3) + 1 * 2(2) + 1 * 2(1) + 1 * 2(0) = 128 + 4 + 2 + 1 = 135
 */
