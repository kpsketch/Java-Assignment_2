
import animal.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Barn {
  private static Scanner input = new Scanner(System.in);
  private static ArrayList<Cow> cows = new ArrayList<Cow>();
  private static ArrayList<Chicken> chickens = new ArrayList<Chicken>();

  public static void main(String[] args) {

    System.out.print("How many animals in the barn? ");
    int animalCount = input.nextInt();

    // loop for animal creation
    for(int i = 0; i < animalCount; i++) {
      System.out.print("1) New Cow 2) New Chicken ");
      int type = input.nextInt();
      input.nextLine(); 

      if(type == 1) { //cow
        System.out.print("Enter milk per day for cow: ");
        int milk = input.nextInt();
        input.nextLine(); 

        Cow cow = new Cow("Cow",milk); // creates a new cow
        cows.add(cow);
      }
      else { // chicken
        System.out.print("Enter egg color for chicken: ");
        String color = input.nextLine();
        Chicken chicken = new Chicken("chicken",color);
        chickens.add(chicken);
      }
    } 

    // printing animal details
    // print cows
    for(int i = 0; i < cows.size(); i++) {
      System.out.printf("Type:%s, MIlk per day :%dL%n",
        cows.get(i).getType(), cows.get(i).getMilkPerDay());
    } // 
    
    // print chickens
    for(int i = 0; i < chickens.size(); i++) {
      System.out.printf("Type: %s, Egg Color: %s%n",
        chickens.get(i).getType(), chickens.get(i).getEggColor());
    } 

    input.close();
    
  } 

} 
