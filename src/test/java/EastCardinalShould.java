import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class EastCardinalShould {

  @Test
  void be_facing_south_when_turned_right() {
    final Cardinal actual = new East().right();

    assertThat(actual, is(new South()));
  }

  @Test
  void be_facing_north_when_turned_left() {
    final Cardinal actual = new East().left();

    assertThat(actual, is(new North()));
  }
  @Test
  void give_cardinal_name() {
    final String actual = new East().name();

    assertThat(actual, is("E"));
  }

}
