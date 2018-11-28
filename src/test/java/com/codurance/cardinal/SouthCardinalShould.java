package com.codurance.cardinal;

import com.codurance.Rover;
import com.codurance.cardinal.Cardinal;
import com.codurance.cardinal.East;
import com.codurance.cardinal.South;
import com.codurance.cardinal.West;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SouthCardinalShould {

  @Test
  void be_facing_east_when_turned_right() {
    final Cardinal actual = new South(1,1).right();

    assertThat(actual, is(new West(1,1)));
  }

  @Test
  void be_facing_west_when_turned_left() {
    final Cardinal actual = new South(1,1).left();

    assertThat(actual, is(new East(1,1)));
  }
  @Test
  void give_cardinal_name() {
    final String actual = new South(1,1).name();

    assertThat(actual, is("S"));
  }
  @Test
  public void
  move_vertically() {
    final Cardinal expected = new South(1,1);
    final Cardinal actual = new South(1,2).move();

    assertThat(actual, is(expected));
  }
}
