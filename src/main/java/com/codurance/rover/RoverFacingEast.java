package com.codurance.rover;

import java.util.Objects;

public class RoverFacingEast extends Rover {
  private String name = "E";

  public RoverFacingEast(int initialX, int initialY) {
    super(initialX,initialY);

  }

  @Override
  public Rover left() {
    return new RoverFacingNorth(x,y);
  }

  @Override
  public Rover right() {
    return new RoverFacingSouth(x,y);
  }

  @Override
  public Rover move() {
    final int stepSize = 1;
    return new RoverFacingEast(x+ stepSize, y);
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RoverFacingEast roverFacingEast = (RoverFacingEast) o;
    return Objects.equals(name, roverFacingEast.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
