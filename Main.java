import java.util.Scanner;

class Main {
  private static Human reader;
  public static void main(String[] args) {
    Scanner bop = new Scanner(System.in);
    //instructions and welcome
    System.out.println("Welcome to My Pet!");
    System.out.println("Keep your pet alive through playtime, nap time, and fun foods! Fill up the XP bar all the way to win!");
    System.out.println("10 is good, 0 is bad");
    System.out.println("What pet would you like? Please enter a number."); //choosing animals
    System.out.println("1. Dog");
    System.out.println("2. Cat");
    System.out.println("3. Fish");
    System.out.println("4. Lizard");
    System.out.println("5. Rock");
    int pet; //initializes variable to hold which pet they choose
    try{
      pet = bop.nextInt(); //taking in number
      System.out.println();
      bop.nextLine(); //catches the empty line after
    }
    catch(Exception f){ //catches in case people try to enter a string or boolean
      System.out.println("Something went wrong...Flipping to default...");
      pet = 5; //default
      bop.nextLine();
    }
    System.out.print("What is your pet's name: ");
    System.out.println();
    String petName = bop.nextLine(); //it wasn't registering because the bop.nextInt() wouldn't register a new line and that was throwing the whole thing off.

    //setting up the pets
    String picture = ""; //initializing the photo that will be printed out with every animal
    if(pet == 1){
      reader = new Human("dog", petName);
      picture = "໒(・ᴥ・)ʋ";
    }
    else if(pet == 2){
      reader = new Human("cat", petName);
      picture = "ฅ^•ﻌ•^ฅ";
    }
    else if(pet == 3){
      reader = new Human("fish", petName);
      picture = "ϵ( 'Θ' )϶";
    }
    else if(pet == 4){
      reader = new Human("lizard", petName);
      picture = "~~I==I:>";
    }
    else if(pet == 5){
      reader = new Human(petName);
      picture = "⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⢀⣠⣖⠖⠚⠉⠉⠉⠈⠈⠈⠉⠉⠉⠉⠉⠉⠉⠉⠙⠻⣄⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡚⡞⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠓⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⣞⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢷⡀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠀⠀⠀⠀⠀⠀⣼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣧⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠀⠀⠀⠀⢀⣾⡍⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⣫⣭⣷⠶⢶⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠀⠀⠀⠀⢸⠏⠀⠀⠀⠀⠀⠀⠀⠀⠴⠛⠛⠉⡁⠀⠀⠙⠻⣿⣷⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠀⠀⠀⢠⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⡷⠷⢿⣦⣤⣈⡙⢿⣿⢆⣴⣤⡄⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⣠⣤⡀⣸⡄⠀⠀⠀⠀⠀⠀⠀⢀⣤⣿⣿⣟⣩⣤⣴⣤⣌⣿⣿⣿⣦⣹⣿⢁⣿⣿⣄⣀⡀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⢠⣿⠋⠻⢿⡁⠀⠀⠀⠀⠀⠀⠀⠀⢸⡿⠿⠛⢦⣽⣿⣿⢻⣿⣿⣿⣿⠋⠁⠘⣿⣿⣿⣿⣿⣿⣼⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⢸⣿⠁⠀⠀⠙⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠒⠿⣿⣯⣼⣿⡿⠟⠃⠀⠀⠀⣿⣿⣿⣿⣿⡛⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⢸⣧⣴⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣺⠟⠃⠀⠀⠀⠀⠀⠀⠙⣿⣿⣿⣿⣿⣿⢁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⢿⠿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⡆⠙⠛⠛⠙⢻⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⣿⣿⡇⠀⠘⠃⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⡟⢿⣿⣆⠀⣸⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢄⡼⠁⢀⣀⡀⠀⠀⠀⣦⣄⠀⣠⡄⣸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⣷⣬⢻⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣧⣰⣿⡿⠿⠦⢤⣴⣿⣿⣷⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⣿⣿⣸⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠛⠛⠒⣿⣿⣿⡿⠟⠹⣼⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⣿⠸⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⡖⠀⢠⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⡿⣾⣿⣸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣆⣀⣀⣤⣴⣶⣶⣾⣿⣷⣦⣴⣼⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⡇⣿⣿⡛⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⢾⡟⠛⠛⠻⠛⠛⠛⠿⠿⠿⠿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠓⢁⣬⣿⠇⠀⠀⠀⠀⠀⢠⡀⠀⠀⠀⠀⠀⢰⡿⣻⠇⠀⠀⠀⠀⠀⣠⣶⣶⣶⣶⣿⣿⡿⣿⣿⣿⣿⢎⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⢐⣯⠞⠁⠀⠀⠀⠀⠀⠀⣄⠱⣄⠀⠀⠀⠀⠸⡧⠟⠆⠀⠀⠀⠀⠘⠿⢿⠿⠿⣿⡿⣿⠃⣿⣿⣿⡟⠘⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⡾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠘⢦⡈⠂⠀⠑⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢠⣿⠀⣿⣿⣿⡏⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠒⡄⠀⠀⠑⠄⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣦⣦⣼⡏⠳⣼⢿⠟⠂⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⢠⣷⣦⣤⣀⣀⣀⣴⣿⣿⣿⣿⣿⡿⢻⢎⡻⢎⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣄⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡑⣷⡅⠀⠁⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
    }
    else{
      reader = new Human();
    }
    Pet animal = reader.getPet();
    
    //boolean print = true;
    while(animal.getAlive()){ //actual loop
      Scanner rawr = new Scanner(System.in);
      System.out.println("Time passes"); //signifying that time passed
      System.out.println("---------------------"); //divider
      
      if(animal.checkAlarm()){ //if there is a reason for the person to react, they will react
        System.out.println(picture);
        animal.printValues(); //printing stats
        System.out.println("What does " + animal.getName() + " need? Enter a number: ");
        //checking what player wants to do
        System.out.println("1 - Eating");
        System.out.println("2 - Play time");
        System.out.println("3 - Take a Nap");
        System.out.println("4 - Nothing");
        int need = rawr.nextInt(); //input
        rawr.nextLine();
        
        if(need == 1){ //if player wants to feed the animal
          System.out.println("What would you like to feed " +animal.getName() + "? Please enter a number: ");
          animal.printFood(); //
          int[] vals = animal.getFoodVal(); //pulling food values
          int food = rawr.nextInt(); //which food do they want
          rawr.nextLine();
          int num = vals[food-1]; //pulling the number linked to the food
          animal.moreHung(num); //feeds animal
        }//closes if need 1
          
        else if(need == 2){
          System.out.println("What would you and " + animal.getName() + " like to play with? Please enter a number: ");
          animal.printToys(); //printing toys
          int play = rawr.nextInt(); //input
          rawr.nextLine(); //skipping line
          int[] vals = animal.getToyVal();
          int num = vals[play-1]; //saving linked number to food
          animal.moreHappy(num); //adding happiness
          animal.lessHung(num/2); //playtime makes you hungry
          animal.lessAwake(); //playtime also makes you tired
        } //closes if need 2

        else if(need == 3){
          System.out.print("For how long should " + animal.getName() + " sleep for (Integer only): ");
          int time;
          try{ //catching errors in case the inputted number is too big or not digits
            time = bop.nextInt(); //input
            bop.nextLine();
          }
          catch(Exception e){
            System.out.println("Something went wrong! Maybe your number is too big? Did you type in only digits? Running 2nd attempt...");
            try{
              System.out.print("For how long should " + animal.getName() + " sleep for (Integer only): "); //retrying the question, allowing person one more time to check
              time = bop.nextInt();
              bop.nextLine();
            }
            catch(Exception g){
              System.out.println("Something went wrong! Switching to default...");
              time = 3;
            }
          }
          
          animal.moreAwake(time); //however long you sleep is how much is added
          animal.lessHung(); //you wake up hungry
        }//closes if need 3
      }
      animal.check(); //checking if bar should be added and if stuff is over 10, reduces it to 10.
      animal.timePass(); //subtracting stuff
      System.out.print("\033[H\033[2J"); //ANSI escape code that clears the screen
      System.out.flush(); //resets the cursor to the top of the screen
    }
    
  }
}