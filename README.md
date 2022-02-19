# PlantArrayList
Given a base Plant class and a derived Flower class, complete main() to create an ArrayList called myGarden. The ArrayList should be able to store objects that belong to the Plant class or the Flower class. Create a method called printArrayList(), that uses the printInfo() methods defined in the respective classes and prints each element in myGarden. The program should read plants or flowers from input (ending with -1), add each Plant or Flower to the myGarden ArrayList, and output each element in myGarden using the printInfo() method.
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
