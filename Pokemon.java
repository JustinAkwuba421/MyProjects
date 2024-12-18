
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    //create ArrayList to read pokeman data from csv file
ArrayList<String[]> pokemonList=new ArrayList<>();

    // define the strings from csv file
    String csvFile = "pokemon.csv";
    String line;
    String csvSplitBy = ",";
    
    //read the csv file and put the data into ArrayList
 try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
while ((line = br.readLine()) !=null)  {
String[] pokemon = line.split(csvSplitBy);
    pokemonList.add(pokemon);
}
    } catch (IOException e) {
       e.printStackTrace();
     }
    //Create scanner and boolean to control the loop
Scanner scanner = new Scanner(System.in);
 boolean searching = true;
       System.out.print("Welcome to the Pokedex. ");
        //begin loop
      while (searching) {
        System.out.println("Would you like to search by name or number?");
  String searchType = scanner.nextLine();

        //if the user wants to search by name
    if (searchType.equalsIgnoreCase("name")) {
      
      //ask user enter the name of the pokemon
 System.out.println("Please enter the name of the Pokemon:");
 String searchName = scanner.nextLine();

      // initialize boolean
    boolean foundPokemon = false;

      
     for (String[] pokemon : pokemonList) {
       if (pokemon[1].equalsIgnoreCase(searchName)) {
  System.out.println(pokemon[1] + ", Pokedex Number "
  + pokemon[0] + ", " + pokemon[2] 
    + ", type1: " + pokemon[3] + ", type2: " + pokemon[4]);
   foundPokemon = true;
          break;

     }
   }
      //if no pokemon was found let the user know
if (!foundPokemon) {
  System.out.println("Sorry there is no Pokemon by that name. Please try again.");
       }

      //if the user wants to search by number
 } else if (searchType.equalsIgnoreCase("number")) {

      //ask user to enter the number of the pokemon
   System.out.println("Please enter the number of the Pokemon:");
String searchNumber = scanner.nextLine();
boolean foundPokemon = false;
for (String[] pokemon : pokemonList) {
if (pokemon[0].equals(searchNumber)) {
   System.out.println(pokemon[1] +
   ", Pokedex Number " + pokemon[0] + ", " + pokemon[2]
                      + ", type1: " + pokemon[3]
                      + ", type2: " + pokemon[4]);
  foundPokemon = true;
      break;
    }
        }
  if (!foundPokemon) {
    // no pokemon was found
    System.out.println( "there is no known Pokemon with that number.Try again.");
          }
      //tell user to try again
     } else {
   System.out.println("Invalid search type. Please try again.");
     }
    // ask user if he/she would like to try again entering yes or no        
  System.out.println("Would you like to search for another Pokemon (yes/no)?");
  String continueSearch = scanner.nextLine();
 if (continueSearch.equalsIgnoreCase("no")) {
       searching = false;
       }
     }
  // thank the user
   System.out.println("Thank you for using your Pokedex!");
  }

}
  
      