package com.codurance.rover;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RoverFacingNorthShould {

  @Test
  void be_facing_east_when_turned_right() {

    final Rover actual = new RoverFacingNorth(1,1).right();
    final Rover expected = new RoverFacingEast(1,1);

    assertThat(actual, is(expected));
  }

  @Test
  void be_facing_west_when_turned_left() {

    final Rover actual = new RoverFacingNorth(1,1).left();
    final Rover expected = new RoverFacingWest(1,1);

    assertThat(actual, is(expected));
  }
  @Test
  void give_cardinal_name() {

    final String actual = new RoverFacingNorth(1,1).name();

    assertThat(actual, is("N"));
  }

  @Test
  public void
  move_vertically() {

    final Rover expected = new RoverFacingNorth(1,2);
    final Rover actual = new RoverFacingNorth(1,1).move();

    assertThat(actual, is(expected));
  }
}
