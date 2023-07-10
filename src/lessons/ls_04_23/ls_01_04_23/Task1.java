package lessons.ls_04_23.ls_01_04_23;

/**
 * Преобразовать данный текст, заменив каждую строку вида переменная=переменная+1; на строку вида переменная++;
 * а каждую строку вида переменная=переменная–1;на строку вида переменная–– .
 */
public class Task1 {
    public static void main(String[] args) {
        String str = "Hello value=value+1; friend count=count-1;";
//        String str = "Hello value++; friend count--;";

        String result = str
                .replace("value=value\\+1", "value++")
                .replace("count=count-1", "count--");

        System.out.println(result);
    }
}
