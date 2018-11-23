package com.codurance.cardinal;


import com.codurance.Rover;

public interface Cardinal {
  Cardinal left();
  Cardinal right();
  Rover move(int x, int y);
  String name();
}
