import java.util.*;

public class Commandcm {
    public List<Command> parse(String input) {
        List<Command> commands = new ArrayList<>();

        for (char ch : input.toCharArray()) {
            switch (ch) {
                case 'F': commands.add(new ForwardCommand()); 
                break;
                case '#': commands.add(new RightCommand());
                 break;
                case '+': commands.add(new LeftCommand()); 
                break;
                default:
                    System.out.println("You are entering invalid command: " + ch);
            }
        }

        return commands;
    }
}
