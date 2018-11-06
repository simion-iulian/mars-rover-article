import org.hamcrest.CoreMatchers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;

public class MarsRoverShould {

  @ParameterizedTest
  @CsvSource({"1, 2, N, '1 2 N'"})
  void return_initial_position_of_rover_without_any_command(int initialX, int initialY, String initialCardinal, String expectedCoordinate) {
    final String emptyCommand = "";

    assertThat(new MarsRover(initialX, initialY, initialCardinal).execute(emptyCommand), CoreMatchers.is(expectedCoordinate));
  }
}
