package com.codurance;

import com.codurance.cardinal.Cardinal;

public class Rover {
  private final int x;
  private final int y;
  private final Cardinal cardinal;

  private final String NORTH = "N";
  private final String SOUTH = "S";
  private final String EAST = "E";
  private final String WEST = "W";

  private final int UP = 1;
  private final int DOWN = -1;
  private final int RIGHT = 1;
  private final int LEFT = -1;


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
    if(facing(NORTH))
      return cardinal.move(x,y);
    if(facing(SOUTH))
      return moveVertically(DOWN);
    if(facing(EAST))
      return moveHorizontally(RIGHT);
    if(facing(WEST))
      return moveHorizontally(LEFT);
    return this;
  }

  private boolean facing(String direction) {
    return cardinal.name().equals(direction);
  }

  private Rover moveVertically(int stepSize) {
    return new Rover(x, y + stepSize, cardinal);
  }

  private Rover moveHorizontally(int stepSize) {
    return new Rover(x + stepSize, y, cardinal);
  }

  String formatPosition() {
    String POSITION_FORMAT = "%d %d %s";
    return String.format(POSITION_FORMAT, x, y, cardinal.name());
  }
}
