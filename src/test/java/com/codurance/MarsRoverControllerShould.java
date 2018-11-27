package com.codurance;

import com.codurance.cardinal.Cardinal;
import com.codurance.cardinal.East;
import com.codurance.cardinal.North;
import com.codurance.cardinal.South;
import com.codurance.cardinal.West;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class MarsRoverControllerShould {

  @ParameterizedTest
  @CsvSource({
    "1, 2, N, '1 2 N'",
    "1, 3, N, '1 3 N'"
  })
  void return_initial_position_of_rover_without_any_command(
    int initialX, int initialY, String initialCardinal,
    String expectedCoordinate) {

    final String emptyCommand = "";
    final Rover initialRover = new Rover(initialX, initialY, cardinalFor(initialCardinal));
    final MarsRoverController rover = new MarsRoverController(initialRover);

    final String actualCoordinate = rover.execute(emptyCommand);

    assertThat(actualCoordinate, is(expectedCoordinate));
  }


  @ParameterizedTest
  @CsvSource({
    "1, 2, N, M, '1 3 N'",
    "1, 3, N, M, '1 4 N'",
    "1, 3, N, MM, '1 5 N'",
    "1, 3, N, MMMMM, '1 8 N'",
    "1, 8, S, M, '1 7 S'",
    "1, 8, S, MMMMM, '1 3 S'",
    "1, 1, E, M, '2 1 E'",
    "1, 1, E, MMMMM, '6 1 E'",
    "8, 1, W, M, '7 1 W'",
    "8, 1, W, MMMMM, '3 1 W'",
  })
  public void
  move(
    int initialX, int initialY, String initialCardinal,
    String commands,
    String expectedCoordinate
  ) {
    final Rover initialRover = new Rover(initialX, initialY, cardinalFor(initialCardinal));
    final MarsRoverController rover = new MarsRoverController(initialRover);

    String actualCoordinate = rover.execute(commands);

    assertThat(actualCoordinate, is(expectedCoordinate));
  }

  @ParameterizedTest
  @CsvSource({
    "N, R, E",
    "N, RR, S",
    "N, RRR, W",
    "N, RRRR, N",
    "N, RRRRRR, S",
    "N, L, W",
    "N, LL, S",
    "N, LLL, E",
    "N, LLLL, N",
    "N, LLLLLL, S",
    "N, LLR, W",
  })
  void turn(
    String initialCardinal,
    String commands,
    String expectedCardinal) {

    final Rover initialRover = new Rover(1, 1, cardinalFor(initialCardinal));
    final MarsRoverController rover = new MarsRoverController(initialRover);

    final String actualPosition = rover.execute(commands);

    final String expectedPosition = "1 1 " + expectedCardinal;

    assertThat(actualPosition, is(expectedPosition));
  }

  @ParameterizedTest
  @CsvSource({
    "1, 2, N, LMLMLMLMM, '1 3 N'",
  })
  public void
  move_and_turn(
    int initialX, int initialY, String initialCardinal,
    String commands,
    String expectedCoordinate
  ) {
    final Rover initialRover = new Rover(initialX, initialY, cardinalFor(initialCardinal));
    final MarsRoverController rover = new MarsRoverController(initialRover);

    String actualCoordinate = rover.execute(commands);

    assertThat(actualCoordinate, is(expectedCoordinate));
  }

    private Cardinal cardinalFor(String cardinal) {
      if (cardinal.equals("N"))
        return new North();
      if (cardinal.equals("E"))
        return new East();
      if (cardinal.equals("S"))
        return new South();
      return new West();
    }

}
