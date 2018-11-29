package com.codurance.rover;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RoverFacingWestShould {

  @Test
  void be_facing_north_when_turned_right() {
    final Rover actual = new RoverFacingWest(1,1).right();

    assertThat(actual, is(new RoverFacingNorth(1,1)));
  }

  @Test
  void be_facing_south_when_turned_left() {
    final Rover actual = new RoverFacingWest(1,1).left();

    assertThat(actual, is(new RoverFacingSouth(1,1)));
  }
  @Test
  void give_cardinal_name() {
    final String actual = new RoverFacingWest(1,1).name();

    assertThat(actual, is("W"));
  }
  @Test
  public void
  move_horizontally() {

    final Rover expected = new RoverFacingWest(2,1);
    final Rover actual = new RoverFacingWest(1,1).move();

    assertThat(actual, is(expected));
  }

}
