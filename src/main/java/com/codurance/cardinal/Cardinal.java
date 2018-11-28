package com.codurance.cardinal;


import com.codurance.Rover;

public abstract class Cardinal {
  protected final int x;
  protected final int y;

  public Cardinal(int initialX, int initialY) {
    this.x = initialX;
    this.y = initialY;
  }

  public abstract Cardinal left();
  public abstract Cardinal right();
  public abstract Cardinal move();
  public abstract String name();

  public String formatPosition() {
    String POSITION_FORMAT = "%d %d %s";
    return String.format(POSITION_FORMAT, x, y, name());
  }
}
