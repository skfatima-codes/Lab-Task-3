public class RightCommand implements Command {
    @Override
    public void execute(Turtle turtle) {
        turtle.turnRight();
    }
}
