import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.UIManager;
import java.awt.Color;

public class RPS{
    public static void main(String [] args ){

    UIManager.put("OptionPane.messageForeground", new Color(255,128,0));

		UIManager.put("Panel.background", new Color(255,255,255));

		UIManager.put("OptionPane.background", new Color(0,204,0));

    int computerChoice;
    String computerPick = null;
    int userScore = 0;
    int computerScore = 0;
    int rounds =0;
    int flag =0;
    JOptionPane.showMessageDialog(null, " Welcome To Rock, Paper, Scissors.! "); // Asking the user to choose.
    String userName = JOptionPane.showInputDialog(null, " Enter Your Name."); // Asking user to enter their name.
    rounds =Integer.parseInt(JOptionPane.showInputDialog(null, " Enter Number Of Rounds."));
    Object[] possibilities = {"Rock", "Paper", "Scissors", "Quit"}; // What options appear on Drop Menu

    boolean isRunning =true;

    do{

    String userChoice = (String)JOptionPane.showInputDialog(null,"Score: " + userName + "=" +userScore + " Computer = " + computerScore + "\nChoose one!:\n","Customized Dialog",JOptionPane.PLAIN_MESSAGE,null,possibilities,""); // Display Menu Box


    Random generator = new Random();
    computerChoice=generator.nextInt(3);
        switch (computerChoice)
            {
                    case 0:
                {
                    computerPick = "Rock";
                    break;
                }
                    case 1:
                {
                    computerPick = "Paper";
                    break;
                }
                    case 2:
                {
                    computerPick = "Scissors";
                    break;
                }

            }
            if(userChoice.equals("Quit")){
              JOptionPane.showMessageDialog(null, "Game Over!!");
              isRunning = false;
              break;


            }else if(userChoice.equals("Rock") && computerPick.equals("Paper")){
              JOptionPane.showMessageDialog(null, "Paper Beats Rock, You Lose!!");
              computerScore++;

            }else if(userChoice.equals("Paper") && computerPick.equals("Rock")){
              JOptionPane.showMessageDialog(null, "Paper Beats Rock, You Win!!");
              userScore++;

            }else if(userChoice.equals("Scissors") && computerPick.equals("Rock")){
              JOptionPane.showMessageDialog(null, "Rock Beats Scissors, You Lose!!");
              computerScore++;

            }else if(userChoice.equals("Rock") && computerPick.equals("Scissors")){
              JOptionPane.showMessageDialog(null, "Rock Beats Scissors, You Win!!");
              userScore++;

            }else if(userChoice.equals("Scissors") && computerPick.equals("Paper")){
              JOptionPane.showMessageDialog(null, "Scissors Beats Paper, You Win!!");
              userScore++;

            }else if(userChoice.equals("Paper") && computerPick.equals("Scissors")){
              JOptionPane.showMessageDialog(null, "Scissors Beats Paper, You Lose!!");
              computerScore++;

            }else if(userChoice.equals("Paper") && computerPick.equals("Paper")){
              JOptionPane.showMessageDialog(null, "It's A Tie");

            } else if(userChoice.equals("Rock") && computerPick.equals("Rock")){
              JOptionPane.showMessageDialog(null, "It's A Tie");

            }else if(userChoice.equals("Scissors") && computerPick.equals("Scissors")){
              JOptionPane.showMessageDialog(null, "It's A Tie");

            }

            if(userScore == rounds )
            {
              isRunning = false;
              flag =1;
              break;
            }
            else if(computerScore == rounds)
            {
              isRunning = false;
              flag = 2;
              break;
            }

            }while(isRunning);

            if(flag ==1)
            {
            //user wins
            JOptionPane.showMessageDialog(null, "Well done " + userName + "You WIN!");
            }//end if
            else if(flag ==2)
            {
        //comuter wins
        JOptionPane.showMessageDialog(null, "Hard Luck Computer wins!");
      }//end else
    }//end main
}//end class
