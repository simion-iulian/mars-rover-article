package com.codurance.cardinal;

import com.codurance.Rover;

import java.util.Objects;

public class West extends Cardinal {
  private String name = "W";

  public West (int initialX, int initialY) {
    super(initialX, initialY);
  }

  @Override
  public Cardinal left() {
    return new South(x, y);
  }
  @Override
  public Cardinal right() {
    return new North(x, y);
  }

  @Override
  public Cardinal move() {
    final int stepSize = -1;
    return new West(x,y+stepSize);
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    West west = (West) o;
    return Objects.equals(name, west.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

}
