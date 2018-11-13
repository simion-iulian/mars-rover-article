public class MarsRover {
  private final String NORTH = "N";
  private final String SOUTH = "S";
  private final String EAST = "E";
  private final String WEST = "W";

  private final int UP = 1;
  private final int DOWN = -1;
  private final int RIGHT = 1;
  private final int LEFT = -1;

  private final String COORDINATE_FORMAT = "%d %d %s";
  private final String INTO_CHARACTERS = "";

  private String MOVE_COMMAND = "M";

  private int x;
  private int y;
  private String cardinal;
  private Coordinate coordinate;

  public MarsRover(Coordinate coordinate) {
    this.x = coordinate.X();
    this.y = coordinate.Y();
    this.cardinal = coordinate.cardinal();
    this.coordinate = coordinate;
  }

  public String execute(String input) {
    for (String command : commandsFrom(input)) {
      if(isMove(command))
        move();
    }

    return formatCoordinate();
  }

  private String[] commandsFrom(String input) {
    return input.split(INTO_CHARACTERS);
  }

  private void move() {



    if(facing(NORTH))
      moveVertically(UP);
    if(facing(SOUTH))
      moveVertically(DOWN);

    if(facing(EAST))
      moveHorizontally(RIGHT);
    if(facing(WEST))
      moveHorizontally(LEFT);
  }

  private void moveVertically(int stepSize) {
    y += stepSize;
  }
  private void moveHorizontally(int stepSize) {
    x += stepSize;
  }

  private boolean isMove(String command) {
    return command.equals(MOVE_COMMAND);
  }

  private boolean facing(String direction) {
    return this.cardinal.equals(direction);
  }

  private String formatCoordinate() {
    return String.format(COORDINATE_FORMAT, x, y, cardinal);
  }
}
