package com.codurance.commands;

import com.codurance.rover.Rover;

import java.util.HashMap;
import java.util.Map;
public class CommandFactory {
  private Rover rover;

  private Map<String, Command> commands;

  public CommandFactory(Rover rover) {
    this.rover = rover;
    initializeCommands(rover);
  }

  public Command commandFrom(String command) {
      return commands.get(command);
  }

  private void initializeCommands(Rover rover) {
    commands = new HashMap<String,Command>(){{
      put("M", new MoveCommand(rover));
      put("L", new TurnLeftCommand(rover));
      put("R", new TurnRightCommand(rover));
      put("", new EmptyCommand(rover));
    }};
  }
}
