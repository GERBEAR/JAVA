import java.util.Random;
import javax.swing.JOptionPane;

public class NumberGuess{
  public static void main(String [] args ){

    int maxSeed = 100; // Sets max value the number can be
    int randNum;
    int userGuess=0;
    int lives = 0;
    String userName = JOptionPane.showInputDialog(null, "Enter Your Name:");

    randNum = (int)(Math.random() * maxSeed); // Generates the random number
    do{
          //JOptionPane.showMessageDialog(null, "random num = " + randNum);

        userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Lives = " + lives + "\n" + userName + " : Guess A Number:"));
        if(userGuess != randNum)
        {
          JOptionPane.showMessageDialog(null, "Incorrect!");
          lives ++;
          if(userGuess < randNum)
          {
              JOptionPane.showMessageDialog(null, "Higher.....");
          }
          else if(userGuess > randNum)
          {
              JOptionPane.showMessageDialog(null, "Lower.....");
          }
        }
        else if(userGuess == randNum)
        {
          JOptionPane.showMessageDialog(null, "Congrats You Guessed Correctly!");
          JOptionPane.showMessageDialog(null, "It Took You " + lives + " Turns To Guess!");
          break;
        }
        if(lives ==10)
        {
            JOptionPane.showMessageDialog(null, "You Ran Out Of Lives. Game Over! You Lose!");
            JOptionPane.showMessageDialog(null, "The Number Was = " + randNum);
            break;
        }


    }//end do
    while(userGuess != randNum);


  }//end main
}//end class
