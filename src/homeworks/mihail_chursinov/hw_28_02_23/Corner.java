package homeworks.mihail_chursinov.hw_28_02_23;

public class Corner {

    public int sumCorner(int triangleN, int rhombusK) {
        int sum = 0;
        if (triangleN > 0 && rhombusK < 10000) {

            sum = triangleN * 3 + rhombusK * 4;
        }
        return sum;
    }
}
class TestCorner{
    public static void main(String[] args) {
        Corner corner = new Corner();
        System.out.println("Sum of corners = " + corner.sumCorner(2, 2));

    }
}
