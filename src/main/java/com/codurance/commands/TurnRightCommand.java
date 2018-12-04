package com.codurance.commands;

import com.codurance.rover.Rover;

public class TurnRightCommand implements Command {
  private Rover rover;

  public TurnRightCommand(Rover rover) {
    this.rover = rover;
  }

  @Override
  public Rover execute() {
    return rover.right();
  }
}
