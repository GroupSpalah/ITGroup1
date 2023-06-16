package homeworks.anton_gvozdenko.hw_04_03_23;

public class SumNum {

    public int sum(int a, int b) {
        if (a > -1000 && b < 1000) {
        }
        return a + b;
    }
}

class Numb {
    public static void main(String[] args) {
        SumNum sum = new SumNum();
        System.out.println(sum.sum(100, 10));
    }
}