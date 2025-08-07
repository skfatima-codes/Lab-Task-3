import java.util.*;

public class Canvas {
    private List<Line> lines;

    public Canvas() {
        lines = new ArrayList<>();
    }

    public void addLine(int x1, int y1, int x2, int y2) {
        lines.add(new Line(x1, y1, x2, y2));
    }

    public void display() {
        System.out.println("Canvas Drawing:");
        for (Line line : lines) {
            System.out.println(line);
        }
    }
}
