import javax.swing.JOptionPane;

public class MenuApp{
    public static void main(String [] args ){

    JOptionPane.showMessageDialog(null," Welcome To MenuApp" ); // Welcome message

    Object[] possibilities ={ "Compliment", "Information On Java", "A Joke", "Exit" }; // Giving The User Choices In The Menu

    boolean isRunning = true;
    do{

        String userChoice = (String)JOptionPane.showInputDialog(null,  "Choose one!:\n","Customized Dialog",JOptionPane.PLAIN_MESSAGE, null,possibilities, "");   // Gives A Drop Selection Menu
        //A Nice Compliment
        if(userChoice.equals("Compliment")){
          JOptionPane.showMessageDialog(null, " You Can Do Whatever You Set Your Mind To! ");

        //Information On Java
        }else if(userChoice.equals("Information On Java")){
          JOptionPane.showMessageDialog(null, " Java Is A General-Purpose Computer Programming Language, That Is Concurrent, Class Based, Object-Oriented.");

        // A Joke
        }else if(userChoice.equals("A Joke")){
          JOptionPane.showMessageDialog(null, " A Guy Is Sitting At Home When He Hears A Knock At The Door. He Opens The Door Seess A Snail On The Porch.\nHe Picks Up The Snail And Throws It As Far As He Can.\n 3 Years Later There's A Knock On The Door.\nHe Opens It And Sees The Same Snail.\nThe Snail Says: 'What The Hell Was That All About'");

        // Exit
      }else if(userChoice.equals("Exit")){
          JOptionPane.showMessageDialog(null, " Thank You For Using MenuApp\n\n Goodbye! ");
          isRunning = false; // Ends Loop
      }

    }while(isRunning);
  }
}







































//1 a nice compliment
//2 info about java
//3 A joke
//4 Exit
