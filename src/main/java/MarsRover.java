public class MarsRover {
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
        if(cardinal.equals("N"))
          y++;
        if(cardinal.equals("S"))
          y--;
    }

    return formatCoordinate();
  }

  private String formatCoordinate() {
    return String.format("%d %d %s", x, y, cardinal);
  }
}
