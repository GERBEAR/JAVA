import javax.swing.JOptionPane;
public class PlanetApp{
  public static void main(String [] args){

    //String to store the users name

    String userName;

    userName = JOptionPane.showInputDialog(null, "Welcome To PlanetApp \n\n Enter Your Name: ");

    JOptionPane.showMessageDialog(null, "Hello \n " + userName +  "\n Welcome To PlanetApp");

    String userInput;
    boolean isRunning = true;
    do{
      userInput = JOptionPane.showInputDialog(null, "Which Planet Would You Like Information About?: ");

      if(userInput.equalsIgnoreCase("Mercury")){
        JOptionPane.showMessageDialog(null, " Mercury Is Named After The Roman Messenger To The Gods. ");
      }else if(userInput.equalsIgnoreCase("Venus")){
        JOptionPane.showMessageDialog(null, " Venus Spins In The Opposite Directon To Most Planets. ");
      }else if(userInput.equalsIgnoreCase("Earth")){
        JOptionPane.showMessageDialog(null, " The Earth is 149,598,262 Km From The Sun. ");
      }else if(userInput.equalsIgnoreCase("Mars")){
        JOptionPane.showMessageDialog(null, " Mars Is Home To Olympus Mons The Solar Systems Tallest Volcano. ");
      }else if(userInput.equalsIgnoreCase("Jupiter")){
        JOptionPane.showMessageDialog(null, " Jupiter Is Large Enough For The Earth To Fit Inside 1,000 Times. ");
      }else if(userInput.equalsIgnoreCase("Saturn")){
        JOptionPane.showMessageDialog(null, " Saturn Has The Second Largest Moon In The Solar System, Titan. ");
      }else if(userInput.equalsIgnoreCase("Uranus")){
        JOptionPane.showMessageDialog(null, " Uranus Is The Coldest Planet In The Solar System. ");
      }else if(userInput.equalsIgnoreCase("Neptune")){
        JOptionPane.showMessageDialog(null, " Neptune Orbits The Sun Once Every 165 Years.  ");
      }else if(userInput.equalsIgnoreCase("Pluto")){
        JOptionPane.showMessageDialog(null, " Pluto Is Now Not Considered A Part Of The Solar System.  ");
      }else if(userInput.equalsIgnoreCase("Ahch-To")){
        JOptionPane.showMessageDialog(null, " Ahch-To Is An Oceanic Planet On Which Luke Skywalker Has Been Hiding For Years, And The Location Of An Ancient Jedi Temple.  ");
      }else if(userInput.equalsIgnoreCase("Alderaan")){
        JOptionPane.showMessageDialog(null, " Princess Leia's home planet. Destroyed by the first Death Star as a demonstration of power.");
      }else if(userInput.equalsIgnoreCase("Anoat")){
          JOptionPane.showMessageDialog(null, " A Nearly Inhospitable Planet Used By The Empire. ");
      }else if(userInput.equalsIgnoreCase("Bespin")){
        JOptionPane.showMessageDialog(null, " Gas Planet And Location Of Cloud City. ");
      }else if(userInput.equalsIgnoreCase("Concord Dawn")){
        JOptionPane.showMessageDialog(null, " Home Planet Of Jango Fett.");
      }else if(userInput.equalsIgnoreCase("Corellia")){
        JOptionPane.showMessageDialog(null, " Home Planet Of Han Solo. An Industrial Planet With A Strong Culture Of Training Pilots");
      }else if(userInput.equalsIgnoreCase("Coruscant")){
        JOptionPane.showMessageDialog(null, " Urban World Consists Of A Planet-Wide City. Governmental Center Of The Galactic Republic And Later The Galactic Empire.");
      }else if(userInput.equalsIgnoreCase("D'Qar")){
        JOptionPane.showMessageDialog(null, " Site Of A Resistance Operations Base Led By General Leia Organa.");
      }else if(userInput.equalsIgnoreCase("Dagobah")){
        JOptionPane.showMessageDialog(null, " Swamp Planet And Yoda's Residence After The Fall Of The Jedi. ");
      }else if(userInput.equalsIgnoreCase("Dantooine")){
        JOptionPane.showMessageDialog(null, " Rural Planet And The Former Site Of A Rebel Base. ");
      }else if(userInput.equalsIgnoreCase("Dathomir")){
        JOptionPane.showMessageDialog(null, " Han Solo Wins The Planet In A Card Game And Lures Princess Leia There To Stop Her From Marrying Someone Else, And Luke Skywalker Discovers That The Infamous Nightsisters Live There.");
      }else if(userInput.equalsIgnoreCase("Devaron")){
        JOptionPane.showMessageDialog(null, " Forest Planet With An Ancient Jedi Temple. ");
      }else if(userInput.equalsIgnoreCase("Endor")){
        JOptionPane.showMessageDialog(null, " Forest Moon That Had The Second Death Star Orbited. Inhabited By Ewoks. The Location Of The Battle Between The Rebel Alliance And The Empire Leading To The Destruction Of The Second Death Star. ");
      }else if(userInput.equalsIgnoreCase("Felucia")){
        JOptionPane.showMessageDialog(null, " Jungle Planet Teeming With Plants But Little Animal Life. ");
      }else if(userInput.equalsIgnoreCase("Geonosis")){
        JOptionPane.showMessageDialog(null, " Rocky Desert Planet Where Battledroids Are Manufactured. ");
      }else if(userInput.equalsIgnoreCase("Hosnian Prime")){
        JOptionPane.showMessageDialog(null, " Urban Planet And Capital Of The New Republic. Destroyed By The First Order's Starkiller Base. ");
      }else if(userInput.equalsIgnoreCase("Hoth")){
        JOptionPane.showMessageDialog(null, " Desolate Ice Planet And Base For The Rebel Alliance. ");
      }else if(userInput.equalsIgnoreCase("Ilum")){
        JOptionPane.showMessageDialog(null, " Planet Where The Crystals That Focus Lightsabers Are Mined. ");
      }else if(userInput.equalsIgnoreCase("Iridonia")){
        JOptionPane.showMessageDialog(null, " Rumored Birthplace Of Darth Maul. ");
      }else if(userInput.equalsIgnoreCase("Jakku")){
        JOptionPane.showMessageDialog(null, " Desert Planet. Site Of A Graveyard Of Ships Damaged During The Final Battle Between The Rebel Alliance And The Empire. ");
      }else if(userInput.equalsIgnoreCase("Kamino")){
        JOptionPane.showMessageDialog(null, " Ocean Planet Where Cloning Technology Is Devolped And The Clone Army Is Created And Trained. ");
      }else if(userInput.equalsIgnoreCase("Kashyyyk")){
        JOptionPane.showMessageDialog(null, " Forest Planet And Home Of The Wookies. ");
      }else if(userInput.equalsIgnoreCase("Kessel")){
        JOptionPane.showMessageDialog(null, " A Mining Planet Which Has Been Fought Over By Crime Lords For It's Valuable Spices.");
      }else if(userInput.equalsIgnoreCase("Lothal")){
        JOptionPane.showMessageDialog(null, " Remote Farm Planet And Birthplace Of Erza Bridger");
      }else if(userInput.equalsIgnoreCase("Malachor")){
        JOptionPane.showMessageDialog(null, " Desolate Sith Temple World And Site Of Two Major Battles. The Scourge Of Malachor Thousands Of Years Ago And An Engagement Between Darth Maul, Several Rebels, Darth Vader, And Several Inquisitors. ");
      }else if(userInput.equalsIgnoreCase("Malastare")){
        JOptionPane.showMessageDialog(null, " Swamp Planet Where Podracing Is Popular. Birthplace Of Sebulba. ");
      }else if(userInput.equalsIgnoreCase("Mandalore")){
        JOptionPane.showMessageDialog(null, " Formerly Habitable Planet And The Subject Of Ledgends Due To Its History Of Mandalorian Warriors. ");
      }else if(userInput.equalsIgnoreCase("Mon Calamari")){
        JOptionPane.showMessageDialog(null, " Ocean Planet, home To The Mon Calamari And Quarren Species. ");
      }else if(userInput.equalsIgnoreCase("MoraBand")){
        JOptionPane.showMessageDialog(null, " Home Planet Of Ancient Sith Lords. ");
      }else if(userInput.equalsIgnoreCase("Mortis")){
        JOptionPane.showMessageDialog(null, " Planet With A Wall Surrounding It, Inhabited By Force Weilders. ");
      }else if(userInput.equalsIgnoreCase("Mustafar")){
        JOptionPane.showMessageDialog(null, " Volcanic Planet And Location Of Showdown Between Anakin Skywalker And Obi-Wan Kenobi. ");
      }else if(userInput.equalsIgnoreCase("Mygeeto")){
        JOptionPane.showMessageDialog(null, "Cold Urban Planet Where Ki Adi Mundi Was Killed. ");
      }else if(userInput.equalsIgnoreCase("Naboo")){
        JOptionPane.showMessageDialog(null, "Home Planet Of The Gungans, Including Jar-Jar Binks, And Various Humans, Who Comprise A Civilation Called The Naboo, Which Include Padmé Amidala And Emperor Palpatine.  ");
      }else if(userInput.equalsIgnoreCase("Nal Hutta")){
        JOptionPane.showMessageDialog(null, "Home Planet Of Jabba And Other Hutts. Close To The Space Station Nar Shaada. ");
      }else if(userInput.equalsIgnoreCase("Onderon")){
        JOptionPane.showMessageDialog(null, " Jungle Planet Where Anakin Skywalker Leads A Revolt Against Its Monarchy. ");
      }else if(userInput.equalsIgnoreCase("Polis Massa")){
        JOptionPane.showMessageDialog(null, " Outer Rim Planetoid Within An Asteroid Field Of The Same Name, Birthplace Of Luke Skywalker And Leia Organa. ");
      }else if(userInput.equalsIgnoreCase("Rishi")){
        JOptionPane.showMessageDialog(null, " Tropical Planet Used By The Republic To Monitor The Nearby Cloning Facility On Kamino. ");
      }else if(userInput.equalsIgnoreCase("Rodia")){
        JOptionPane.showMessageDialog(null, " Home Planet Of Greedo And Other Rodians. ");
      }else if(userInput.equalsIgnoreCase("Ruusan")){
        JOptionPane.showMessageDialog(null, "Barren Planet Housing The Valley Of The Jedi. ");
      }else if(userInput.equalsIgnoreCase("Ryloth")){
        JOptionPane.showMessageDialog(null, " Home Planet Of Oola And Other Twi'leks. ");
      }else if(userInput.equalsIgnoreCase("Shili")){
        JOptionPane.showMessageDialog(null, " Home Of Jedi Council Member Shaak Ti. ");
      }else if(userInput.equalsIgnoreCase("Starkiller Base")){
        JOptionPane.showMessageDialog(null, " Ice Planet Converted By The First Order Into A Super Weapon. Destroyed By The Resistence. ");
      }else if(userInput.equalsIgnoreCase("Sullust")){
        JOptionPane.showMessageDialog(null, " Volcanic Planet. Base Of Imperial Factories. ");
      }else if(userInput.equalsIgnoreCase("Takodana")){
        JOptionPane.showMessageDialog(null, " Forest Planet And Site Of Maz Kanata's Castle. Neutral Territory Between First Order And Resistence. ");
      }else if(userInput.equalsIgnoreCase("Tatooine")){
        JOptionPane.showMessageDialog(null, "Desert Planet And Childhood Home Of Anakin Skywalker And Luke Skywalker. ");
      }else if(userInput.equalsIgnoreCase("Toydaria")){
        JOptionPane.showMessageDialog(null, " Home Planet Of Watto And Other Toydarians. Close To Nal Hutta. ");
      }else if(userInput.equalsIgnoreCase("Trandosha")){
        JOptionPane.showMessageDialog(null, " Homeworld Of The Trandoshan Hunters. Close To Kashyyyk. ");
      }else if(userInput.equalsIgnoreCase("Umbara")){
        JOptionPane.showMessageDialog(null, " Planet With A Thick, Foggy Atmosphere. ");
      }else if(userInput.equalsIgnoreCase("Utapau")){
        JOptionPane.showMessageDialog(null, " Location Of A Separatist Base. Site Of General Grievous' Defeat. ");
      }else if(userInput.equalsIgnoreCase("Yavin")){
        JOptionPane.showMessageDialog(null, " Gas Planet With Several Moons. Including Yavin 4. ");
      }else if(userInput.equalsIgnoreCase("Yavin 4")){
        JOptionPane.showMessageDialog(null, " Forest Moon And Base For The Rebel Alliacne. ");
      }else{
        //A message saying goodbye..
        isRunning = false;
      }
    }while(isRunning);

  }
}
