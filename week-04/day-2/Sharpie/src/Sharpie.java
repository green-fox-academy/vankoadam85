public class Sharpie {
  String color;
  float width;
  float inkAmount;

  Sharpie (String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public void use() {
    inkAmount--;
  }
}
