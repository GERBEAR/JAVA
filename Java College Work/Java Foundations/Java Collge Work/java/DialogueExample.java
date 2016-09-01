import javax.swing.JOptionPane;

public class DialogueExample{
  public static void main(String [] args){

    //String to store the users name

    String userName;

    userName = JOptionPane.showInputDialog(null, " Enter Your Name: ");

    //System is the same as JOptionPane.showMessageDialog

    //System.out.println(userName);

    JOptionPane.showMessageDialog(null, "Hello \n\n " + userName);

    

  }

}
