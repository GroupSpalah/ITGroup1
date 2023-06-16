package homeworks.anton_gvozdenko.hw_25_03_23;

public class Task4 {
    public static void main(String[] args) {
        String[] array = {"Hello", "world", "from", "array"};
        {

            for (int i = 0; i < array.length; ++i) {
                int sum = 0;
                if (i % 2 == 0) {
                    sum += array[i].length();
                    System.out.println(sum);
                }
            }
        }
    }
}