package com.codurance.rover;

import java.util.Objects;

public class RoverFacingNorth extends Rover {
  private String name = "N";

  public RoverFacingNorth(int x, int y) {
    super(x,y);

  }

  @Override
  public Rover left() {
    return new RoverFacingWest(x,y);
  }

  @Override
  public Rover right() {
    return new RoverFacingEast(x,y);
  }

  @Override
  public Rover move() {
    int stepSize = 1;
    return new RoverFacingNorth(x, y + stepSize);
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RoverFacingNorth roverFacingNorth = (RoverFacingNorth) o;
    return Objects.equals(name, roverFacingNorth.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
