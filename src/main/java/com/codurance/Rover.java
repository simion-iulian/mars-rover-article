package com.codurance;

import com.codurance.cardinal.Cardinal;

import java.util.Objects;

public class Rover {
  private final int x;
  private final int y;
  private final Cardinal cardinal;

  public Rover(int x, int y, Cardinal cardinal) {
    this.x = x;
    this.y = y;
    this.cardinal = cardinal;
  }



  public Rover turnRight() {
    return new Rover(x,y, cardinal.right());
  }

  public Rover turnLeft() {
    return new Rover(x,y, cardinal.left());
  }

  Rover move() {
      return cardinal.move(x,y);
  }

  String formatPosition() {
    String POSITION_FORMAT = "%d %d %s";
    return String.format(POSITION_FORMAT, x, y, cardinal.name());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Rover rover = (Rover) o;
    return x == rover.x &&
      y == rover.y &&
      Objects.equals(cardinal, rover.cardinal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, cardinal);
  }
}
