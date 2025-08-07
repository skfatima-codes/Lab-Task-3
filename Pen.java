public class Pen {
    private int x, y, angle;
    private Canvas canvas;

    public Pen(Canvas canvas) {
        this.x = 0;
        this.y = 0;
        this.angle = 0;
        this.canvas = canvas;
    }

    public void moveForward() {
        int oldX = x;
        int oldY = y;

        switch (angle) {
            case 0: x += 1; break;
            case 90: y += 1; break;
            case 180: x -= 1; break;
            case 270: y -= 1; break;
        }

        canvas.addLine(oldX, oldY, x, y);
        System.out.println("Moving forward to (" + x + ", " + y + ")");
    }

    public void turnLeft() {
        angle = (angle + 270) % 360;
        System.out.println("Turned left " + angle + "°");
    }

    public void turnRight() {
        angle = (angle + 90) % 360;
        System.out.println("Turned right " + angle + "°");
    }
}
