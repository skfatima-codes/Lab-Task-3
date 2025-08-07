public class ForwardCommand implements Command {
    @Override
    public void execute(Turtle turtle) {
        turtle.forward();
    }
}
