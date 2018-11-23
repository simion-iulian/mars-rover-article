package com.codurance.cardinal;

import com.codurance.Rover;

import java.util.Objects;

public class North implements Cardinal {
  private final int stepSize = 1;
  private String name = "N";
  @Override
  public Cardinal left() {
    return new West();
  }

  @Override
  public Cardinal right() {
    return new East();
  }

  @Override
  public Rover move(int x, int y) {
    return new Rover(x, y + stepSize, this);
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
