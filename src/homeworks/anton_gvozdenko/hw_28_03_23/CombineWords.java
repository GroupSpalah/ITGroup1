package homeworks.anton_gvozdenko.hw_28_03_23;

public class CombineWords {
    public static void main(String[] args) {
        String numbEight = "eight";
        String numbOne = "one";
        String subEight = numbEight.substring(1);
        String result = numbOne.concat(subEight);
        System.out.println(result);
    }
}
