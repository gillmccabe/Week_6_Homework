import java.util.*;

class Dog {
  private String name;
  private int weight;
  private ArrayList<Edible> belly;


  public Dog(String name, int weight){
    this.name = name;
    this.weight = weight;
    this.belly = new ArrayList<Edible>();
  }

  public String getName(){
    return this.name;
  }

  public int getWeight(){
    return this.weight + (boneCount() * 10);
  }

  public int boneCount() {
    return belly.size();
  }

  public void chew(Edible food){
    belly.add(food);
  }


  public Edible sick() {
    if (boneCount() > 0) {
      return belly.remove(0);
    }
    return null;
  }


}