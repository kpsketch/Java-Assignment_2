package animal;

public class Cow extends Animal {
  private int milkPerDay;

  // Explicit constructor that calls Animal's parameterized constructor
  public Cow(String type , int milkPerDay) {
      super(type); // Calls Parent's constructor
      this.milkPerDay = super.randNum.nextInt(16) + 10; // 10-25
  } // constructor

  // getters
  public int getMilkPerDay() {
    return this.milkPerDay;
  }

  // setters
  public void setMilkPerDay (int milkPerDay) {
    this.milkPerDay = milkPerDay;
    
  }
} // class
