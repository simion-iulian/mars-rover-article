public class MarsRover {
  private final String NORTH = "N";
  private final String SOUTH = "S";
  private final String EAST = "E";
  private final String WEST = "W";

  private final int UP = 1;
  private final int DOWN = -1;
  private final int RIGHT = 1;
  private final int LEFT = -1;

  private final String POSITION_FORMAT = "%d %d %s";
  private final String INTO_CHARACTERS = "";

  private String MOVE_COMMAND = "M";

  private Position position;

  public MarsRover(Position position) {
    this.position = position;
  }

  public String execute(String input) {
    for (String command : commandsFrom(input)) {
      if(isMove(command))
        move();
      if(command.equals("R"))
        position = new Position(position.x(), position.y(), "E");
    }
    return formatPosition();
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

  private boolean facing(String direction) {
    return position.facing(direction);
  }

  private void moveVertically(int stepSize) {
    position = new Position(x(), position.y() + stepSize, position.cardinal());
  }
  private void moveHorizontally(int stepSize) {
    position = new Position(position.x()+stepSize, position.y(), position.cardinal());
  }

  private boolean isMove(String command) {
    return command.equals(MOVE_COMMAND);
  }

  private String formatPosition() {
    return String.format(POSITION_FORMAT, x(), y(), position.cardinal());
  }

  private int x() {
    return position.x();
  }

  private int y(){
    return position.y();
  }
}
