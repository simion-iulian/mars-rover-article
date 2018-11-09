public class MarsRover {
  private final String NORTH = "N";
  private final String SOUTH = "S";
  private int x;
  private int y;
  private String cardinal;
  private String MOVE_COMMAND = "M";

  public MarsRover(int x, int y, String cardinal) {

    this.x = x;
    this.y = y;
    this.cardinal = cardinal;
  }

  public String execute(String input) {

    String[] commands = input.split("");

    for (String command:commands) {

      if(isMove(command))
        if(facing(NORTH))
          y++;
        if(facing(SOUTH))
          y--;
    }

    return formatCoordinate();
  }

  private boolean isMove(String command) {
    return command.equals(MOVE_COMMAND);
  }

  private boolean facing(String direction) {
    return this.cardinal.equals(direction);
  }

  private String formatCoordinate() {
    return String.format("%d %d %s", x, y, cardinal);
  }
}
