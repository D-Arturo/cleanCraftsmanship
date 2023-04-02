package main.codurance;

public class Rover {

    private Direction direction = Direction.NORTH;
    private final int x = 0;
    private int y = 0;

    public String execute(String commands) {
        for (char c : commands.toCharArray()) {
            if (c == 'R') {
                direction = direction.right();
            }
            if (c == 'L') {
                direction = direction.left();
            }
            if (c == 'M') {
                if (direction == Direction.NORTH) {
                    y = 1;
                }
            }
        }
        return "0" + ":" + y + ":" + direction.value();
    }


}
