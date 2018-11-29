package com.codurance.rover;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RoverFacingSouthShould {

  @Test
  void be_facing_east_when_turned_right() {
    final Rover actual = new RoverFacingSouth(1,1).right();

    assertThat(actual, is(new RoverFacingWest(1,1)));
  }

  @Test
  void be_facing_west_when_turned_left() {
    final Rover actual = new RoverFacingSouth(1,1).left();

    assertThat(actual, is(new RoverFacingEast(1,1)));
  }
  @Test
  void give_cardinal_name() {
    final String actual = new RoverFacingSouth(1,1).name();

    assertThat(actual, is("S"));
  }
  @Test
  public void
  move_vertically() {
    final Rover expected = new RoverFacingSouth(1,1);
    final Rover actual = new RoverFacingSouth(1,2).move();

    assertThat(actual, is(expected));
  }
}
