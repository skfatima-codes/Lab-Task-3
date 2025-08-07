import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turtle turtle = new Turtle();
        Commandcm parser = new Commandcm();

        System.out.print("Enter turtle command string like F+F-F+F): ");
        String input = scanner.nextLine();

        List<Command> commands = parser.parse(input);

        System.out.println(" Turtle Commands");
        for (Command cmd : commands) {
            cmd.execute(turtle);
        }

        turtle.showCanvas();
        scanner.close();
    }
}
