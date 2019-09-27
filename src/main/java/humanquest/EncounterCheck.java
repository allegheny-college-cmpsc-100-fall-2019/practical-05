package gatorquest;

import java.io.File;
import java.io.FileNotFoundException;
// Implement the Random class from the java.util package
// Implement the Scanner class from the java.util package

/** Class uses Gator Wizard's character sheet in various encounters.
 *
 * @author {YOUR NAME HERE}
 */
public class EncounterCheck {
  
  /** Entry point for EncounterCheck class.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    Random d13 = new Random();
    // Declare file and scanner objects.
    File encFile = null;
    Scanner scanner = null;
    // Connect files to Scanner object.
    try {
      encFile = new File("inputs/encounters.txt");
      scanner = new Scanner(encFile);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    // TODO Perform first encounter
    String encounter = // Get encounter title
    int checkRoll = // Get value for check roll
    scanner.nextLine(); // Move scanner along
    int result = // Make 13-sided die roll
    /*
     * TODO Display the encounterReport
     */
    // TODO Perform next encounter
    encounter = // Get encounter title
    checkRoll = // Get value for check roll
    result = // Make 13-sided die roll
    // Display the encounterReport
    /*
     * TODO Display the encounterReport
     */   
  }
  
  /** Prints the encounterReport.
   *
   * @param title The encounter name
   * @param check The required roll
   * @param roll The actual roll
   */
  public static void encounterReport(String title, int check, int roll) {
    title = title.replace("_"," ");
    System.out.println("To defeat the " + title + ":");
    System.out.println("Gator needed to roll\t" + check);
    System.out.println("Gator's actual roll\t" + roll);
    if (roll > check) {
      System.out.println("And the Gator Wizard triumphed!");
    } else {
      System.out.println("And the Gator Wizard succumbed!");
    }
  }
}