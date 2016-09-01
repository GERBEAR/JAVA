import javax.swing.JOptionPane;
public class SwitchExample{
  public static void main(String[] args ){

    // Declaring our Console.


    String userInput; // Declaring our string to hold data

    boolean isRunning = true;// used to loop program so it doesnt end when 1 month is entered

    do{
    userInput = JOptionPane.showInputDialog(null, " Enter In A Month "); // Declaring our JOptionPane

    switch (userInput){

        case "January":
        case "january":
        JOptionPane.showMessageDialog(null, " January Is The 1st Month ");
        break;// end case 1

        case "February":
        case "february":
        JOptionPane.showMessageDialog(null, " Febuary Is The 2nd Month" );
        break;// end case 2

        case "March":
        case "march":
        JOptionPane.showMessageDialog(null, " March Is The 3rd Month" );
        break;// end case 3

        case "April":
        case "april":
        JOptionPane.showMessageDialog(null, " April Is The 4th Month ");
        break;// end case 4

        case "May":
        case "may":
        JOptionPane.showMessageDialog(null, " May Is The 5th Month ");
        break;// end case 5

        case "June":
        case "june":
        JOptionPane.showMessageDialog(null, " June Is The 6th Month ");
        break;// end case 6

        case "July":
        case "july":
        JOptionPane.showMessageDialog(null, " July Is The 7th Month" );
        break;// end case 7

        case "August":
        case "august":
        JOptionPane.showMessageDialog(null, " August Is The 8th Month ");
        break;// end case 8

        case "September":
        case "september":
        JOptionPane.showMessageDialog(null, " September Is The 9th Month ");
        break;// end case 9

        case "October":
        case "october":
        JOptionPane.showMessageDialog(null, " October Is The 10th Month " );
        break;// end case 10

        case "November":
        case "november":
        JOptionPane.showMessageDialog(null, " November IS the 11th Month ");
        break;// end case 11

        case "December":
        case "december":
        isRunning = true;
        JOptionPane.showMessageDialog(null, " December Is The 12th Month ");
        break;// end case 12

        default :
        JOptionPane.showMessageDialog(null, " Invalid Selection Please Try Again ");
        break;// end case 13

         }
      }while(isRunning);
  }
}
