import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class MarsRoverShould {

  @Test
  void return_initial_position_of_rover_without_any_command() {
    final String emptyCommand = "";

    assertThat(new MarsRover(1,2,"N").execute(emptyCommand), CoreMatchers.is("1 2 N"));
  }
}
