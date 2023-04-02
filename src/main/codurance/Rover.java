package main.codurance;

import static main.codurance.Direction.NORTH;

public class Rover {

    private Direction direction = NORTH;
    private Coordinates coordinates = new Coordinates(0, 0);

    public String execute(String commands) {
        for (char c : commands.toCharArray()) {
            if (c == 'R') {
                direction = direction.right();
            }
            if (c == 'L') {
                direction = direction.left();
            }
            if (c == 'M') {
                coordinates = move();
            }
        }
        return "0" + ":" + coordinates.y() + ":" + direction.value();
    }

    private Coordinates move() {
        int y = coordinates.y();
        if (direction == NORTH) {
            y += 1;
        }
        return new Coordinates(0, y);
    }


}
