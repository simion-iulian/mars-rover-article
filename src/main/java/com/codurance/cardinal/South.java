package com.codurance.cardinal;

import com.codurance.Rover;

import java.util.Objects;

public class South extends Cardinal {
  private String name = "S";

  public South(int initialX, int initialY) {
    super(initialX,initialY);

  }

  @Override
  public Cardinal left() {
    return new East(x,y);
  }

  @Override
  public Cardinal right() {
    return new West(x,y);
  }

  @Override
  public Cardinal move() {
    int stepSize = -1;
    return new South(x, y + stepSize);
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    South south = (South) o;
    return Objects.equals(name, south.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
