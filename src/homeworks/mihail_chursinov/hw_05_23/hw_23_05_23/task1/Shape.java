package homeworks.mihail_chursinov.hw_05_23.hw_23_05_23.task1;

public abstract class Shape {
    private ShareType shareType;
    private String name;
    private String side;


    public Shape(ShareType shareType, String name, String side) {
        this.shareType = shareType;
        this.name = name;
        this.side = side;
    }

    public ShareType getShareType() {
        return shareType;
    }

    public void drawSquare() {
        //Code for drawing square
    }

    public void drawCircle() {
        //Code for drawing square
    }

    public void drawShape() {
        if (getShareType() == ShareType.SQUARE) {
            drawSquare();
        } else {
            drawCircle();
        }
    }
}
