package com.codurance.cardinal;

import com.codurance.Rover;
import com.codurance.cardinal.Cardinal;
import com.codurance.cardinal.North;
import com.codurance.cardinal.South;
import com.codurance.cardinal.West;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WestCardinalShould {

  @Test
  void be_facing_north_when_turned_right() {
    final Cardinal actual = new West().right();

    assertThat(actual, is(new North()));
  }

  @Test
  void be_facing_south_when_turned_left() {
    final Cardinal actual = new West().left();

    assertThat(actual, is(new South()));
  }
  @Test
  void give_cardinal_name() {
    final String actual = new West().name();

    assertThat(actual, is("W"));
  }
  @Test
  public void
  move_horizontally() {

    final Rover expected = new Rover(1, 1, new West());
    final Rover actual = new West().move(2, 1);

    assertThat(actual, is(expected));
  }

}
