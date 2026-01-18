import java.util.Scanner;
import java.lang.System;

public class Pet{
  Scanner bop = new Scanner(System.in);
 // private int age;
  private String petName;
  private String type;
  // private String hooman;
  private int hunger; //need food? max 10 means no hunger
  private int happy; //need playtime? max 10 means completely happy
  private int awake; //need nap time? max 10 means not sleepy
  // private int thirsty; //need water? max 10 means not thirsty
  private boolean stillAlive = true; //checks if still alive or still being taken care of
  private String[] bar = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
  private int curIndex = 0;

  private String[] foodHold = {"pea gravel", "More rocks", "quartz of milk", "hedgehog food", "nothing"};
  private int[] foodValHold = {10, 3, 7, 4, 0};
  private String[] toysHold = {"potpourri", "bathwater", "play music", "paints", "nothing"};
  private int[] toyValHold = {10, 3, 8, 9, 0};

  public Pet(){
    // foodHold = new String[0];
    // foodValHold = new int[0];
    // toysHold = new String[0];
    // toyValHold = new int[0];
    type = "Rock";
    petName = "Dwayne";
    // hooman = "Tester";
   // age = 0;
    hunger = 9;
    happy = 9;
    awake = 9;
    // thirsty = 10;
  }

  public Pet(String name){
    type = "rock";
    petName = name;
    hunger = 9;
    happy = 8;
    awake = 9;
  }

  public Pet(String type, String name){
    // foodHold = new String[0];
    // foodValHold = new int[0];
    // toysHold = new String[0];
    // toyValHold = new int[0];
    this.type = type;
    petName = name;
    // hooman = human;
   // age = 0;
    hunger = 7;
    happy = 8;
    awake = 9;
    // thirsty = 10;
  }

  //printing out the stats of the pet
  public void printValues(){
   // System.out.println("My age is " + age);
    printBar();
    System.out.println("My hunger is " + hunger);
    System.out.println("My happiness is " + happy);
    System.out.println("My awakeness is " + awake);
  //   System.out.println("My water fullness is " + thirsty);
  }

  //printing the level up bar
  public void printBar(){
    System.out.print("XP Bar: {");
    for(String check : bar){
      System.out.print(check);
    }
    System.out.println("}");
  }

  //Hunger controls
  public void lessHung(){
    hunger--;
  }

  public void moreHung(int num){
    hunger += num;
  }

  public void lessHung(int num){
    hunger -=num;
  }

  public void moreHung(){
    hunger++;
  }
  //happiness controls
  public void lessHappy(){
    happy--;
  }

  public void lessHappy(int num){
    happy -= num;
  }

  public void moreHappy(){
    happy++;
  }

  public void moreHappy(int num){
    happy += num;
  }
  //sleepiness controls
  public void lessAwake(){
    awake--;
  }

  public void moreAwake(){
    awake++;
  }

  public void lessAwake(int num){
    awake-=num;
  }

  public void moreAwake(int num){
    awake+=num;
  }

  // public void lessThirst(){
  //   thirsty--;
  // }

  // public void moreThirst(){
  //   thirst++;
  // }

  //set animal to dead
  public void Unlive(){
    stillAlive = false;
  }

  public void setName(String name){
    petName = name;
  }

  // public void setHuman(String name){
  //   hooman = name;
  // }

  //is pet alive?
  public boolean getAlive(){
    return stillAlive;
  }

  //type of pet
  public String getType(){
    return type;
  }

  //pet name
  public String getName(){
    return petName;
  }

  //returns the food list
  public String[] getFood(){
    return foodHold;
  }

  //returns parallel food list
  public int[] getFoodVal(){
    return foodValHold;
  }

  //returns toy list
  public String[] getToys(){
    return toysHold;
  }

  //returns parallel toy list
  public int[] getToyVal(){
    return toyValHold;
  }

  //prints food array in list format
  public void printFood(){
    for(int index = 0; index < foodHold.length; index++){
      System.out.println(index+1 + ". " + foodHold[index]);
    }
  }

  //prints toy array in list format
  public void printToys(){
    for(int index = 0; index < toysHold.length; index++){
      System.out.println(index+1 + ". " +toysHold[index]);
    }
  }

  //checks if human needs to take action and checks if stats hit zero
  public boolean checkAlarm(){

    //check for maltreatment
    if(hunger <= 0){
      Unlive();
      System.out.println("You didn't take good care of me. I'm leaving.");
      System.exit(0);
    }
    if(happy <= 0){
      Unlive();
      System.out.println("I'm too depressed to be around you. I'm leaving.");
      System.exit(0);
    }
    if(awake <= 0){
      Unlive();
      System.out.println("I literally can't keep my eyes open. I need a break from you.");
      System.exit(0);
    }
    
    // if(thirsty >=0 && thirsty < 4){
    //   System.out.println("I'm feeling woozy. I need water!");
    // }
    // else if(thirsty >=4 && thirsty < 7){
    //   System.out.println("I'm kinda thirsty, where's the water at?");
    // }
    //checking happiness factor
    if (happy >= 0 && happy < 4){
      System.out.println("I'm sad. Why won't you play with me?");
      return true;
    }
    else if(happy >=4 && happy < 7){
      System.out.println("I'm bored. Can we do something?");
      return true;
    }
    //checking hunger factor
    if(hunger >=0 && hunger < 4){
      System.out.println("I'm starving! FEED ME SEYMOUR!");
      return true;
    }
    else if(hunger >= 4 && hunger < 7){
      System.out.println("Could I have some food please?");
      return true;
    }
    //checking awake factor
    if(awake >= 0 && awake < 4){
      System.out.println("I'm so tired, I can barely keep my eyes open.");
      return true;
    }
    else if(awake >= 4 && awake < 7){
      System.out.println("*Yawns* I could use a short nap.");
      return true;
    }
    return false;
    
  }

  //reduces things to 10 if they are over, bc 10 is max
  public void check(){
    boolean change = false;
    if(awake >= 10){
      awake = 10;
      change = true;
    }
    if(hunger >= 10){
      hunger = 10;
      change = true;
    }
    if(happy >= 10){
      happy = 10;
      change = true;
    }
    
    if(change){
      bar[curIndex] = "#";
      curIndex++;
      System.out.println("Adding...");
    }
    if(curIndex >= bar.length){
      win();
    }
    // if(thirsty > 10){
    //   thirsty = 10;
    // }
  }

  //running the win
  public void win(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    printBar();
    System.out.println("YOU WON!");
    System.out.println("That's right, this game isn't endless.");
    System.out.println("You leveled up your pet by caring for them enough! Congratulations!");
    System.out.println("Now I'm kinda tired, so I'm going to go sleep and hang out with my family for a bit. If you wish to play again, feel free to rerun the program! You can pick any of the other animals, as each animal has different options, or start over with the original. Thank you so much for playing!");
    System.out.println();
    System.out.println("Credits:");
    System.out.println("Arya B - Emotional Support");
    System.out.println("Sabine K - Creator");
    System.out.println("Julian K - Game End Idea");
    System.out.println("Hafsah M - Dog Toy Ideas, Rock");
    System.out.println("Marian M - Lizard Class Idea");
    System.out.println("Angeleena P - Dog Toy Ideas");
    System.out.println("Thank you to anyone else I may have missed, and thank YOU for playing. I hope you enjoyed.");
      System.exit(0);
  }

  //ticking down the factors
  public void timePass(){
    lessAwake();
    lessHappy();
    lessHung();
    // lessThirst();
  }

  // public void play(){
  //   System.out.println("Yay!");
  //   System.out.print("How long should we play for? Enter a number from 1 to 5:  ");
  //   int num = bop.nextInt();
  //   while(num < 1 || num > 5){
  //     System.out.print("That's outside the bounds! Please pick a new number:  ");
  //     num = bop.nextInt();
  //   }
  //   System.out.println("Awesome! Playing...");
  //   for(int i = 0; i < num; i++){
  //     moreHappy();
  //     if(!justAte){
  //       if(hunger >= 6){
  //         if(i%2 == 1){lessHung();}
  //       }
  //       else{lessHung();}
  //     }
  //     if(thirsty >= 6){
  //       if(i%2 == 1){lessThirst();}
  //     }
  //     else{lessThirst();}
  //     if(sleepy >= 6){
  //       if(i%2 == 1){lessAwake();}
  //     }
  //     else{lessAwake();}
  //   }
  //}
  
}