class Position {
  private final int x;
  private final int y;
  private final String cardinal;

  Position(int x, int y, String cardinal) {
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

  boolean facing(String direction) {
    return cardinal.equals(direction);
  }

  public Position turnRight() {
    if(cardinal.equals("N"))
      return new Position(x, y, "E");
    if(cardinal.equals("E"))
      return new Position(x,y,"S");
    if(cardinal.equals("S"))
      return new Position(x,y,"W");
    return new Position(x,y,"N");
  }

  public Position turnLeft() {
    if(cardinal.equals("N"))
      return new Position(x, y, "W");
    if(cardinal.equals("W"))
      return new Position(x,y,"S");
    if(cardinal.equals("S"))
      return new Position(x,y,"E");
    return new Position(x,y,"N");

  }
}
