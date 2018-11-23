package com.codurance.cardinal;

import com.codurance.Rover;

import java.util.Objects;

public class East implements Cardinal{
  private String name = "E";
  @Override
  public Cardinal left() {
    return new North();
  }

  @Override
  public Cardinal right() {
    return new South();
  }

  @Override
  public Rover move(int x, int y) {
    return null;
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
