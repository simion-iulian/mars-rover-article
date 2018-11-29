package com.codurance.rover;


public abstract class Rover {
  protected final int x;
  protected final int y;

  public Rover(int initialX, int initialY) {
    this.x = initialX;
    this.y = initialY;
  }

  public abstract Rover left();
  public abstract Rover right();
  public abstract Rover move();
  public abstract String name();

  public String formatPosition() {
    String POSITION_FORMAT = "%d %d %s";
    return String.format(POSITION_FORMAT, x, y, name());
  }
}
