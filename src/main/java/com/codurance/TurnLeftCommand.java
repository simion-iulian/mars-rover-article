package com.codurance;

import com.codurance.rover.Rover;

public class TurnLeftCommand implements Command {
  private Rover rover;

  public TurnLeftCommand(Rover rover) {
    this.rover = rover;
  }

  @Override
  public Rover execute() {
    return rover.left();
  }
}
