class Rover {
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

  private Cardinal cardinalFor(String cardinal){
    if(cardinal.equals("N"))
      return new North();
    if(cardinal.equals("E"))
      return new East();
    if(cardinal.equals("S"))
      return new South();
    return new West();

  }

  Rover(int x, int y, String cardinal) {
    this.x = x;
    this.y = y;
    this.cardinal = cardinalFor(cardinal);
  }

  private String cardinal() {
    return cardinal.name();
  }


  public Rover turnRight() {
    return new Rover(x,y, cardinal.right().name());
  }

  public Rover turnLeft() {
    return new Rover(x,y, cardinal.left().name());
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
    return cardinal().equals(direction);
  }

  private Rover moveVertically(int stepSize) {
    return new Rover(x, y + stepSize, cardinal());
  }

  private Rover moveHorizontally(int stepSize) {
    return new Rover(x + stepSize, y, cardinal());
  }

  String formatPosition() {
    String POSITION_FORMAT = "%d %d %s";
    return String.format(POSITION_FORMAT, x, y, cardinal());
  }
}
