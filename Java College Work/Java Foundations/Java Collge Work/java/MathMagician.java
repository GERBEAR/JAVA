import javax.swing.JOptionPane;
public class MathMagician{
  public static void main(String[] args){
    int maxSeed = 100;  //Sets max value the random number can be

    int randNum;
    boolean isOdd = true;
    do{
      randNum = (int)(Math.random() * maxSeed); //Generates the random number
      if(randNum % 2 == 0){
          isOdd = false;
      }
    }while(isOdd);

    // String For userName And Welcome Message.
    String userName;

    userName = JOptionPane.showInputDialog(null, " Welcome To The Math Magician \n\nPlease Enter Your Name. ");

    JOptionPane.showMessageDialog(null, "Hello \n" + userName +  "\n I Am The Math Magician");

    //Think of a number
    JOptionPane.showMessageDialog(null, " I Want You To Think Of A Number Between 0 - 100\n When Ready Click Ok. ");
    //Double it
    JOptionPane.showMessageDialog(null, " Now I Want You To Double Your Number.\n When Ready Click Ok. ");
    //"Add "+randNum+" to it."
    JOptionPane.showMessageDialog(null, " Now I Want You To Add " + randNum + " To Your Number.\n When Ready Click Ok. ");
    //Half it
    JOptionPane.showMessageDialog(null, " Now I Want You To Half Your Number.\n When Ready Click Ok.  ");
    //First number you thought of subtract your number from it
    JOptionPane.showMessageDialog(null, " The Very First Number You Thought Of, I Want You To Subtract It From The Number You Have Now.\n When Ready Click Ok. ");
    //"Your answer is " +(randNum / 2)
    JOptionPane.showMessageDialog(null, " Now For Some Magic ");

    JOptionPane.showMessageDialog(null, " Your Answer Is " + ( randNum / 2));
  }

}
