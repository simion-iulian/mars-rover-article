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

  public String execute(String commands) {
    String[] individualCommands = commands.split("");

    for (String command:individualCommands) {
      if(command.equals(MOVE_COMMAND))
        if(cardinal.equals(NORTH))
          y++;
        if(cardinal.equals(SOUTH))
          y--;
    }

    return formatCoordinate();
  }

  private String formatCoordinate() {
    return String.format("%d %d %s", x, y, cardinal);
  }
}
