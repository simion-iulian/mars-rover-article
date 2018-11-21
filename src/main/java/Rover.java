class Rover {
  private final int x;
  private final int y;
  private final String cardinal;

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

  boolean facing(String direction) {
    return cardinal.equals(direction);
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
}
