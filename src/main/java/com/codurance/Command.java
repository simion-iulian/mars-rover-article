package com.codurance;

import com.codurance.rover.Rover;

interface Command {
  Rover execute();
}
