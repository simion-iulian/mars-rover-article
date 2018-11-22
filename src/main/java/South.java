import java.util.Objects;

public class South implements Cardinal{
  private String name = "S";
  @Override
  public Cardinal left() {
    return new East();
  }

  @Override
  public Cardinal right() {
    return new West();
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    South south = (South) o;
    return Objects.equals(name, south.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
