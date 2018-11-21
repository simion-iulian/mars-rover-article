public class MarsRoverController {
  public static final String RIGHT_COMMAND = "R";
  public static final String LEFT_COMMAND = "L";

  private final String INTO_CHARACTERS = "";

  private String MOVE_COMMAND = "M";

  private Rover rover;

  public MarsRoverController(Rover rover) {
    this.rover = rover;
  }

  public String execute(String input) {
    for (String command : commandsFrom(input)) {
      if(isMove(command))
        rover = rover.move();
      if(isTurnRight(command))
        rover = rover.turnRight();
      if(isTurnLeft(command))
        rover = rover.turnLeft();
    }
    return rover.formatPosition();
  }

  private boolean isTurnLeft(String command) {
    return command.equals(LEFT_COMMAND);
  }

  private boolean isTurnRight(String command) {
    return command.equals(RIGHT_COMMAND);
  }

  private String[] commandsFrom(String input) {
    return input.split(INTO_CHARACTERS);
  }

  private boolean isMove(String command) {
    return command.equals(MOVE_COMMAND);
  }

}
