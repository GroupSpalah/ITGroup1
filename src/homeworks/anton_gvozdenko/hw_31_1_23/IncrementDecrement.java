package homeworks.anton_gvozdenko.hw_31_1_23;

public class IncrementDecrement {
    public static void main(String[] args) {

        int count = 2;
        int result = ++count + --count + ++count + count++;// 3 + 2 + 3 + 3= 11
        int result1 = count++ + --count + ++count;// 4 + 4 + 5 =13
        int result2 = count-- + --count + ++count;//5 + 3 + 4 = 12
        int result3 = count++ + --count - ++count;//4 + 4 - 5 = 3
        int result4 = ++count + count++ + ++count;//6 + 6 +8 = 20
        int result5 = ++count + ++count + count++;//9 + 10+ 10 =29
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }


}






