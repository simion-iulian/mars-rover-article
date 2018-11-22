import java.util.Objects;

public class West implements Cardinal {
  private String name = "W";

  @Override
  public Cardinal left() {
    return new South();
  }
  @Override
  public Cardinal right() {
    return new North();
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    West west = (West) o;
    return Objects.equals(name, west.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

}
