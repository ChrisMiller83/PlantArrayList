import java.util.Scanner;
import java.util.ArrayList;
/*  import java.util.StringTokenizer;  */

/* Given a base Plant class and a derived Flower class, complete main() to create an ArrayList called myGarden. The ArrayList should be able to store objects that belong to the Plant class or the Flower class. Create a method called printArrayList(), that uses the printInfo() methods defined in the respective classes and prints each element in myGarden. The program should read plants or flowers from input (ending with -1), add each Plant or Flower to the myGarden ArrayList, and output each element in myGarden using the printInfo() method.
  Ex. If the input is:

  plant Spirea 10 
  flower Hydrangea 30 false lilac 
  flower Rose 6 false white
  plant Mint 4
  -1
  the output is:

  Plant Information: 
    Plant name: Spirea
    Cost: 10

  Plant Information: 
    Plant name: Hydrangea
    Cost: 30
    Annual: false
    Color of flowers: lilac

  Plant Information: 
    Plant name: Rose
    Cost: 6
    Annual: false
    Color of flowers: white

  Plant Information: 
    Plant name: Mint
    Cost: 4
*/


public class PlantArrayList {

  /* Define a printArrayList method that prints an ArrayList of plant (or flower) objects */

  public static void printArrayList(ArrayList<Plant> myGarden) {
    int i;

    for (i = 0; i < myGarden.size(); ++i) {
      myGarden.get(i).printInfo();
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String input;

    /* Declare an ArrayList called myGarden that can hold object of type plant */
    ArrayList<Plant> myGarden = new ArrayList<>();

    /* Declare variables - plantName, plantCost, colorOfFlowers, isAnnual */

    String plantName;
    String plantCost;
    String colorOfFlowers;
    boolean isAnnual;

    input = scnr.next();

    while (!input.equals("-1")) {     
      
      plantName = scnr.next();
      plantCost = scnr.next();

      /* Check if input is a plant or flower */
      if (input.equals("plant")) {
        /* Store as a plant object or flower object */
        Plant myPlant = new Plant();
        
        myPlant.setPlantName(plantName);
        myPlant.setPlantCost(plantCost);

        /* Add to the ArrayList myGarden */
        myGarden.add(myPlant);
      } 
      else if (input.equals("flower")) {
        /* Store as a plant object or flower object */
        Flower myFlower = new Flower();

        myFlower.setPlantName(plantName);
        myFlower.setPlantCost(plantCost);

        isAnnual = scnr.nextBoolean();
        colorOfFlowers = scnr.next();

        myFlower.setPlantType(isAnnual);
        myFlower.setColorOfFlowers(colorOfFlowers);

        /* Add to the ArrayList myGarden */
        myGarden.add(myFlower);
      }
      input = scnr.next();
    }

    /* Call the method printArrayList to print myGarden */

    printArrayList(myGarden);
    scnr.close();
  }
}