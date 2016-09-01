import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
            int computerChoice;
            String computerPick;
        JOptionPane.showMessageDialog(null, "Welcome to my Rock, Paper, Scissors game! ");
        //Asking User to choose Rock, paper or Scissors
            Object[] possibilities = {"Rock", "Paper", "Scissors"};
String s = (String)JOptionPane.showInputDialog(
                    null,
                    "Choose one!:\n",
                    "Customized Dialog",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    possibilities,
                    "Rock");
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
                                default:
                            {
                                computerPick = "will not happen";
                            }
                        }
                if (s.equals(computerPick))
                    {
                     System.out.println("It's a tie!");
                    }
                    else if (s.equals("Rock"))
                    {
                     if (computerPick.equals("Scissors"))
                    System.out.println("Rock demolishes the crap out of scissors. You win!!");
                         else if (computerPick.equals("Paper"))
                         System.out.println ("In real life paper would never beat rock but in this game it does. You lose!!");
                    }
                    else if (s.equals("Paper"))
                    {
                    if (computerPick.equals("Scissors"))
                        System.out.println ("Scissor dices paper. You lose!!");
                        else if (s.equals("Rock"))
                        System.out.println ("you lucky bastard, paper would never beat rock in reality but whatever. You win!!");
                    }
                    else if (s.equals("Scissors"))
                    {
                     if (computerPick.equals("Paper"))
                     System.out.println ("Scissor dices paper. You win!!");
                     else if (computerPick.equals("Rock"))
                     System.out.println ("Rock demolishes the crap out of scissors. You lose!!");
                    }
                    else
                    {
                     System.out.println ("Invalid user input.");
                    }
        }
    }
