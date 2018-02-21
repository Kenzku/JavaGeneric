package shopping;

public class Shoe implements Colored, Sized {
  private String color;
  private int size;

  public Shoe(String color, int size) {
    this.color = color;
    this.size = size;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  public String getColor() {
    return color;
  }
}
