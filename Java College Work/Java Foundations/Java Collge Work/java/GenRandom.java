/*
How to generate a random number between 0 - whatever
*/

public class GenRandom{
  public static void main(String[] args){
    int maxSeed = 100;  //Sets max value the random number can be

    int randNum = (int)(Math.random() * maxSeed); //Generates the random number

    System.out.println(randNum);  //Prints the random number
  }

}
