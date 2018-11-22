class Rover {
  private final int x;
  private final int y;
  private final String cardinal;

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
      return moveHorizontally(RIGHT);
    if(facing(WEST))
      return moveHorizontally(LEFT);
    return this;
  }

  private boolean facing(String direction) {
    return cardinal.equals(direction);
  }

  private Rover moveVertically(int stepSize) {
    return new Rover(x, y + stepSize, cardinal);
  }

  private Rover moveHorizontally(int stepSize) {
    return new Rover(x + stepSize, y, cardinal);
  }

  String formatPosition() {
    String POSITION_FORMAT = "%d %d %s";
    return String.format(POSITION_FORMAT, x, y, cardinal());
  }
}
