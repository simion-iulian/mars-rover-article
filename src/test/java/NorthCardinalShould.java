import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NorthCardinalShould {

  @Test
  void be_facing_east_when_turned_right() {

    final Cardinal actual = new North().right();
    final Cardinal expected = new East();

    assertThat(actual, is(expected));
  }

  @Test
  void be_facing_west_when_turned_left() {

    final Cardinal actual = new North().left();
    final Cardinal expected = new West();

    assertThat(actual, is(expected));
  }
  @Test
  void give_cardinal_name() {

    final String actual = new North().name();

    assertThat(actual, is("N"));
  }
}
