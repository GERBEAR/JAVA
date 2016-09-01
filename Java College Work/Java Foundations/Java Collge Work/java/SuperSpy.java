import javax.swing.JOptionPane;
import java.util.Scanner;
public class SuperSpy{
  public static void main(String [] args){

  JOptionPane.showMessageDialog(null, "Hello \n\nWelcome to SuperSpy!");

  JOptionPane.showMessageDialog(null, "You are a great Super Spy & Lady Lover,\n because you like to stay classy, your tuxedo has been ripped to shreds by previous ladies and your sexual exhuastion from previous encounters gives you a health of 70%");

  String userInput;
  String userName;
  //int health = 70;

  userName = JOptionPane.showInputDialog(null, "Please State Your SpyName:");

  JOptionPane.showMessageDialog(null, " Suddenly Your Spy phone starts to ring, It's MI6!.");

  JOptionPane.showMessageDialog(null, " Hello " + userName + " We have a mission for you.");

  JOptionPane.showMessageDialog(null, " Please State Accept or Decline");

  boolean accept = true;

  userInput = JOptionPane.showInputDialog(null, " ");


  if(userInput.equalsIgnoreCase("Accept")){
    JOptionPane.showMessageDialog(null, "Great to hear that you still have balls " + userName +" !!!");
    JOptionPane.showMessageDialog(null, "Welcome to Operation Java ");
    JOptionPane.showMessageDialog(null, "This will be a suicide mission, one you might not survive.! ");

    userInput = JOptionPane.showInputDialog(null, "You have two Options to get there\n 1 - In your new Aston Martin DB9 \n 2 - By your new and improved RAH-66 Comanche Helicopter  ");
        if(userInput.equals("1")){
          JOptionPane.showMessageDialog(null, "Great choice! But you don't have the keys. What will you do?" + userName);
           userInput = JOptionPane.showInputDialog(null, "1 - Will you break the window? \n2 - Go back to the RAH-66 Comanche Helicopter?");
              if(userInput.equals("1")){
                JOptionPane.showMessageDialog(null, "By breaking the window you hurt your arm and shoulder. You lost a 20 health points");
                JOptionPane.showMessageDialog(null, "You DIE!!!"); //here you can continue instead of dieing
                //here the story ends
              }else{
                JOptionPane.showMessageDialog(null, "HEY!!! On the the Helicopter pad you are comfronted with a guard dog. You are bitten by the dog, and you end up having rabies and slowly falling unconscious");
              } // here you can contiue the story if you want
            }else{
              JOptionPane.showMessageDialog(null, "You managed to get the Comanche off the ground, but half way towards the destination, you realize that you are running low on fuel");
              JOptionPane.showMessageDialog(null, "Will you Jump? \n\nYes or No?");
              userInput = JOptionPane.showInputDialog(null, " ");
                if(userInput.equalsIgnoreCase("yes")){
                  JOptionPane.showMessageDialog(null, "Oh A W E S O M E ! ! ! \nYou picked the COOL way to escape!");
                }
                else{
                  JOptionPane.showMessageDialog(null, "You can't land though \nYou are flying over a huge rainforest, and by landing, the Helicopter smashes and you DIE!");
                }

        }

  }else{
  JOptionPane.showMessageDialog(null, "Oh, so you prefer to stay with the ladies, I see..");


  }
  }
}
