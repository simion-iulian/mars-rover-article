package com.codurance;

import com.codurance.rover.Rover;

class MoveCommand implements Command{
  private final Rover rover;
  public MoveCommand(Rover rover){
    this.rover = rover;
  }

  @Override
  public Rover execute() {
    return rover.move();
  }
}
