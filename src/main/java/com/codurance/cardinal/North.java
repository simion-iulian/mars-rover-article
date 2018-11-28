package com.codurance.cardinal;

import com.codurance.Rover;

import java.util.Objects;

public class North extends Cardinal {
  private String name = "N";

  public North(int x, int y) {
    super(x,y);

  }

  @Override
  public Cardinal left() {
    return new West(x,y);
  }

  @Override
  public Cardinal right() {
    return new East(x,y);
  }

  @Override
  public Cardinal move() {
    int stepSize = 1;
    return new North(x, y + stepSize);
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    North north = (North) o;
    return Objects.equals(name, north.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
