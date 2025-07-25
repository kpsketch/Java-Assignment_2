package animal;

public class Chicken extends Animal {
  private String eggColor;

  // Explicit constructor that calls Animal's parameterized constructor
  public Chicken(String type ,String eggColor) {
      super(type); // Calls Parent's constructor
      
    this.eggColor = eggColor;
  } // constructor

  // getters
  public String getEggColor() {
    return this.eggColor;
  }

  // setters
  public void setEggColor(String eggColor) {
    this.eggColor = eggColor;
  }

  

} 
