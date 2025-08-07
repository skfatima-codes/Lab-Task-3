public class Turtle {
    private Pen pen;
    private Canvas canvas;

    public Turtle() {
        this.canvas = new Canvas();
        this.pen = new Pen(canvas);
    }

    public void forward() {
        pen.moveForward();
    }

    public void turnLeft() {
        pen.turnLeft();
    }

    public void turnRight() {
        pen.turnRight();
    }

    public void showCanvas() {
        canvas.display();
    }
}
