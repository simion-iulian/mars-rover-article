class Rover {
  private int x;
  private int y;
  private String cardinal;

  private final String NORTH = "N";
  private final String SOUTH = "S";
  private final String EAST = "E";
  private final String WEST = "W";

  private final int UP = 1;
  private final int DOWN = -1;
  private final int RIGHT = 1;
  private final int LEFT = -1;

  Rover(int x, int y, String cardinal) {
    this.x = x;
    this.y = y;
    this.cardinal = cardinal;
  }

  public int x() {
    return x;
  }

  public int y() {
    return y;
  }

  public String cardinal() {
    return cardinal;
  }


  public Rover turnRight() {
    if(cardinal.equals("N"))
      return new Rover(x, y, "E");
    if(cardinal.equals("E"))
      return new Rover(x,y,"S");
    if(cardinal.equals("S"))
      return new Rover(x,y,"W");
    return new Rover(x,y,"N");
  }

  public Rover turnLeft() {
    if(cardinal.equals("N"))
      return new Rover(x, y, "W");
    if(cardinal.equals("W"))
      return new Rover(x,y,"S");
    if(cardinal.equals("S"))
      return new Rover(x,y,"E");
    return new Rover(x,y,"N");

  }

  Rover move() {
    if(facing(NORTH))
      return moveVertically(UP);
    if(facing(SOUTH))
      return moveVertically(DOWN);
    if(facing(EAST))
      moveHorizontally(RIGHT);
    if(facing(WEST))
      moveHorizontally(LEFT);
    return this;
  }

  private boolean facing(String direction) {
    return cardinal.equals(direction);
  }

  private Rover moveVertically(int stepSize) {
    return new Rover(x, y+=stepSize, cardinal);
  }

  private void moveHorizontally(int stepSize) {
    x+=stepSize;
  }
}
