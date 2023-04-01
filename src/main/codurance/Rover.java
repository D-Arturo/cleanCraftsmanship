package main.codurance;

public class Rover {

    private String direction = "N";

    public String execute(String commands) {
        for (char c : commands.toCharArray()) {
            if (c == 'R') direction = rotateRight();
            if (c == 'L') direction = rotateLeft();
        }
        return "0:0:" + direction;
    }

    private String rotateLeft() {
        if (direction == "N") return "W";
        return "S";
    }

    private String rotateRight() {
        if (direction == "N") {
            return "E";
        } else if (direction == "E") {
            return "S";
        } else if (direction == "S") {
            return "W";
        } else {
            return "N";
        }
    }
}
