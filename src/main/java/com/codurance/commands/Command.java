package com.codurance.commands;

import com.codurance.rover.Rover;

public interface Command {
  Rover execute();
}
