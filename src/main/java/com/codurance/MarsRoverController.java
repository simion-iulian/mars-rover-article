package com.codurance;

import com.codurance.commands.CommandFactory;
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

  private String[] commandsFrom(String input) {
    String INTO_CHARACTERS = "";
    return input.split(INTO_CHARACTERS);
  }
}
