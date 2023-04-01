package main.codurance;

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
        return nextDirection(right);
    }

    private Direction nextDirection(String right) {
        for (Direction potentialDirection : values()) {
            if (right == potentialDirection.value) {
                return potentialDirection;
            }
        }
        return null;
    }

    public Direction left() {
        for (Direction potentialDirection : values()) {
            if (this.left == potentialDirection.value) {
                return potentialDirection;
            }
        }
        return null;
    }

    public String value() {
        return value;
    }
}
