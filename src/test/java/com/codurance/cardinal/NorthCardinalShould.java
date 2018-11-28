package com.codurance.cardinal;

import com.codurance.Rover;
import com.codurance.cardinal.Cardinal;
import com.codurance.cardinal.East;
import com.codurance.cardinal.North;
import com.codurance.cardinal.West;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NorthCardinalShould {

  @Test
  void be_facing_east_when_turned_right() {

    final Cardinal actual = new North(1,1).right();
    final Cardinal expected = new East(1,1);

    assertThat(actual, is(expected));
  }

  @Test
  void be_facing_west_when_turned_left() {

    final Cardinal actual = new North(1,1).left();
    final Cardinal expected = new West(1,1);

    assertThat(actual, is(expected));
  }
  @Test
  void give_cardinal_name() {

    final String actual = new North(1,1).name();

    assertThat(actual, is("N"));
  }

  @Test
  public void
  move_vertically() {

    final Cardinal expected = new North(1,2);
    final Cardinal actual = new North(1,1).move();

    assertThat(actual, is(expected));
  }
}
