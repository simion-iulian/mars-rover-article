import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SouthCardinalShould {

  @Test
  void be_facing_east_when_turned_right() {
    final Cardinal actual = new South().right();

    assertThat(actual, is(new West()));
  }

  @Test
  void be_facing_west_when_turned_left() {
    final Cardinal actual = new South().left();

    assertThat(actual, is(new East()));
  }
  @Test
  void give_cardinal_name() {
    final String actual = new South().name();

    assertThat(actual, is("S"));
  }
}
