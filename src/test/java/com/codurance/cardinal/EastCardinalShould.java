package com.codurance.cardinal;

import com.codurance.Rover;
import com.codurance.cardinal.Cardinal;
import com.codurance.cardinal.East;
import com.codurance.cardinal.North;
import com.codurance.cardinal.South;

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

  @Test
  public void
  move_horizontally() {

    final Rover expected = new Rover(2, 1, new East());
    final Rover actual = new East().move(1, 1);

    assertThat(actual, is(expected));
  }


}
