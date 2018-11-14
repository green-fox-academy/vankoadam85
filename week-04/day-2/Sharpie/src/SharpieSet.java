import java.util.ArrayList;

public class SharpieSet {
  ArrayList<Sharpie> sharpieSet = new ArrayList<>();

  public int countUsable () {
    int usable = 0;
    for (int i = 0; i < sharpieSet.size() ; i++) {
      if (sharpieSet.get(i).inkAmount > 0) {
        usable++;
      }
    }
    return usable;
  }

  public void removeTrash () {
    for (int i = sharpieSet.size() - 1; i >= 0; i--) {
      if (sharpieSet.get(i).inkAmount <= 0){
        sharpieSet.remove(i);
      }
    }
  }
}
