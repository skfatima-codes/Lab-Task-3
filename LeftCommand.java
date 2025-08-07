public class LeftCommand implements Command {
    @Override
    public void execute(Turtle turtle) {
        turtle.turnLeft();
    }
}
