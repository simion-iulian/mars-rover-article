package com.codurance.commands;

import com.codurance.rover.Rover;

import java.util.HashMap;
import java.util.Map;
public class CommandFactory {
  private static final String MOVE = "M";
  private static final String LEFT = "L";
  private static final String RIGHT = "R";
  private static final String EMPTY = "";
  private Map<String, Command> commands;

  public CommandFactory(Rover rover) {
    initializeCommands(rover);
  }

  public Command commandFrom(String command) {
      return commands.get(command);
  }

  private void initializeCommands(Rover rover) {
    commands = new HashMap<String,Command>(){{
      put(MOVE, new MoveCommand(rover));
      put(LEFT, new TurnLeftCommand(rover));
      put(RIGHT, new TurnRightCommand(rover));
      put(EMPTY, new EmptyCommand(rover));
    }};
  }
}
