package com.codurance;

import com.codurance.rover.Rover;

public class MarsRoverController {


  private Rover rover;
  public MarsRoverController(Rover rover) {
    this.rover = rover;
  }

  public String execute(String input) {
    for (String command : commandsFrom(input)) {
        rover = new CommandFactory(rover).commandFrom(command).execute();
    }
    return rover.formatPosition();
  }

  private boolean isTurnLeft(String command) {
    String LEFT_COMMAND = "L";
    return command.equals(LEFT_COMMAND);
  }
  private boolean isTurnRight(String command) {
    String RIGHT_COMMAND = "R";
    return command.equals(RIGHT_COMMAND);
  }
  private boolean isMove(String command) {
    String MOVE_COMMAND = "M";
    return command.equals(MOVE_COMMAND);
  }
  private String[] commandsFrom(String input) {
    String INTO_CHARACTERS = "";
    return input.split(INTO_CHARACTERS);
  }
}
