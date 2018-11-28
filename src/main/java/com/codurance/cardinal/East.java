package com.codurance.cardinal;

import com.codurance.Rover;

import java.util.Objects;

public class East extends Cardinal {
  private String name = "E";

  public East(int initialX, int initialY) {
    super(initialX,initialY);

  }

  @Override
  public Cardinal left() {
    return new North(x,y);
  }

  @Override
  public Cardinal right() {
    return new South(x,y);
  }

  @Override
  public Cardinal move() {
    final int stepSize = 1;
    return new East(x+ stepSize, y);
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    East east = (East) o;
    return Objects.equals(name, east.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
