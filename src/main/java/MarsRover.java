public class MarsRover {
  private final String NORTH = "N";
  private final String SOUTH = "S";

  private final int UP = 1;
  private final int DOWN = -1;

  private final String COORDINATE_FORMAT = "%d %d %s";

  private String MOVE_COMMAND = "M";

  private int x;
  private int y;
  private String cardinal;

  public MarsRover(int x, int y, String cardinal) {
    this.x = x;
    this.y = y;
    this.cardinal = cardinal;
  }

  public String execute(String input) {
    String[] commands = input.split("");

    for (String command:commands) {
      if(isMove(command))
        move();
    }

    return formatCoordinate();
  }

  private void move() {
    if(facing(NORTH))
      moveVertically(UP);
    if(facing(SOUTH))
      moveVertically(DOWN);
  }

  private void moveVertically(int stepSize) {
    y += stepSize;
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
