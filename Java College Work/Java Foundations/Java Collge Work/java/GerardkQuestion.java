import javax.swing.JOptionPane
public class GerardkQuestion{
  public static void main(String[] args ){

    // Declaring our Console.


    String userInput; // Declaring our string to hold data

    boolean isRunning = true;// used to loop program so it doesnt end when 1 colour is entered

    userInput = JOptionPane.showInputDialog(null, " Enter A Colour "); // Declaring our JOptionPane

    switch (userInput){

    case "Red":
    case "red":
    JOptionPane.showMessageDialog(null, " Red ");
    break;// end case 1

    case "Blue":
    case "blue":
    JOptionPane.showMessageDialog(null, " Blue ");
    break;// end case 2

    case "Green":
    case "green":
    JOptionPane.showMessageDialog(null, " Green ");
    break;// end case 3

    case "Yellow":
    case "yellow":
    JOptionPane.showMessageDialog(null, " Yellow ");
    break;// end case 4

    case "Orange":
    case "orange":
    JOptionPane.showMessageDialog(null, " Orange");
    break;// end case 5

    case "White":
    case "white":
    JOptionPane.showMessageDialog(null, " White ");
    break;// end case 6

    default:
    JOptionPane.showMessageDialog(null, " Invalid Option Please Try Again ");
    break;//end case 7


    // 1 - Works Perfectly
    // 2 - Boolean = False
    // 3 - default
    // 4 - Expected Import Java Error
    }
  }
}
