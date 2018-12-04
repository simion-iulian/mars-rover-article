package com.codurance;

import com.codurance.rover.Rover;

public class EmptyCommand implements Command {
  private Rover rover;

  public EmptyCommand(Rover rover) {
    this.rover = rover;
  }

  @Override
  public Rover execute() {
    return rover;
  }
}
