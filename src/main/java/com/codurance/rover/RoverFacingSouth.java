package com.codurance.rover;

import java.util.Objects;

public class RoverFacingSouth extends Rover {
  private String name = "S";

  public RoverFacingSouth(int initialX, int initialY) {
    super(initialX,initialY);

  }

  @Override
  public Rover left() {
    return new RoverFacingEast(x,y);
  }

  @Override
  public Rover right() {
    return new RoverFacingWest(x,y);
  }

  @Override
  public Rover move() {
    int stepSize = -1;
    return new RoverFacingSouth(x, y + stepSize);
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RoverFacingSouth roverFacingSouth = (RoverFacingSouth) o;
    return Objects.equals(name, roverFacingSouth.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
