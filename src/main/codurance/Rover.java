package main.codurance;

public class Rover {

    private String direction = "N";
    private Direction eDirection = Direction.NORTH;

    public String execute(String commands) {
        for (char c : commands.toCharArray()) {
            if (c == 'R') {
                eDirection = eDirection.right();
                direction = eDirection.value;

            }
            if (c == 'L') direction = rotateLeft();
        }
        return "0:0:" + direction;
    }

    private String rotateLeft() {
        if (direction == "N") return "W";
        if (direction == "W") return "S";
        if (direction == "S") return "E";
        return "N";
    }

    private String rotateRight() {
        if (direction == "N") return "E";
        if (direction == "E") return "S";
        if (direction == "S") return "W";
        return "N";
    }

    enum Direction {
        NORTH("N", "W", "E"),
        SOUTH("S", "E", "W"),
        EAST("E", "N", "S"),
        WEST("W", "S", "N");

        private final String value;
        private final String left;
        private final String right;

        Direction(String value, String left, String right) {

            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Direction right() {
            for (Direction potentialDirection : values()) {
                if (this.right == potentialDirection.value) {
                    return potentialDirection;
                }
            }
            return null;
        }
    }
}
