package homeworks.mihail_chursinov.hw_05_23.hw_16_05_23.task3;

public class Triangle extends Figure {

    public static final float CONST_TRIANGLE = 0.5f;

    public Triangle(float side, float height) {

        super(side, height);
    }

    @Override
    public float calculatable() {
        return CONST_TRIANGLE * super.calculatable();
    }
}
