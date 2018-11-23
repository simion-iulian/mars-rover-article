package com.codurance.cardinal;

import java.util.Objects;

public class North implements Cardinal {
  private String name = "N";
  @Override
  public Cardinal left() {
    return new West();
  }

  @Override
  public Cardinal right() {
    return new East();
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    North north = (North) o;
    return Objects.equals(name, north.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
