package main.codurance;

public class Rover {

    private String direction = "N";

    public String execute(String commands) {
        for (char c : commands.toCharArray()) {
            if (direction == "W") {
                direction = "N";
            } else if (direction == "S") {
                direction = "W";
            } else if (direction == "E") {
                direction = "S";
            } else {
                direction = "E";
            }
        }
        return "0:0:" + direction;
    }
}
