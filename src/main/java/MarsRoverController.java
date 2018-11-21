public class MarsRoverController {
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

  private Rover rover;

  public MarsRoverController(Rover rover) {
    this.rover = rover;
  }

  public String execute(String input) {
    for (String command : commandsFrom(input)) {
      if(isMove(command))
        move();
      if(command.equals("R"))
        rover = rover.turnRight();
      if(command.equals("L"))
        rover = rover.turnLeft();
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
    return rover.facing(direction);
  }

  private void moveVertically(int stepSize) {
    rover = new Rover(x(), rover.y() + stepSize, rover.cardinal());
  }
  private void moveHorizontally(int stepSize) {
    rover = new Rover(rover.x()+stepSize, rover.y(), rover.cardinal());
  }

  private boolean isMove(String command) {
    return command.equals(MOVE_COMMAND);
  }

  private String formatPosition() {
    return String.format(POSITION_FORMAT, x(), y(), rover.cardinal());
  }

  private int x() {
    return rover.x();
  }

  private int y(){
    return rover.y();
  }
}
