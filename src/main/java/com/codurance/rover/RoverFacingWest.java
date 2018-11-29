package com.codurance.rover;

import java.util.Objects;

public class RoverFacingWest extends Rover {
  private String name = "W";

  public RoverFacingWest(int initialX, int initialY) {
    super(initialX, initialY);
  }

  @Override
  public Rover left() {
    return new RoverFacingSouth(x, y);
  }
  @Override
  public Rover right() {
    return new RoverFacingNorth(x, y);
  }

  @Override
  public Rover move() {
    final int stepSize = -1;
    return new RoverFacingWest(x+stepSize,y);
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RoverFacingWest roverFacingWest = (RoverFacingWest) o;
    return Objects.equals(name, roverFacingWest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

}
