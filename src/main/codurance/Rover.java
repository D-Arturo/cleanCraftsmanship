package main.codurance;

import static main.codurance.Direction.EAST;
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
        return coordinates.x() + ":" + coordinates.y() + ":" + direction.value();
    }

    private Coordinates move() {
        int y = coordinates.y();
        int x = coordinates.x();
        if (direction == NORTH) {
            y = (y + 1) % 10;
        }
        if (direction == EAST) {
            x = (x + 1);
        }
        return new Coordinates(x, y);
    }


}
