public class Cat extends Pet{
  private String[] food = new String[] {"catnip", "kibble", "fish", "chicken", "turkey", "nothing"}; //cat food
  private int[] foodVal = new int[] {2, 5, 10, 3, 6, 0}; //1 is low, 10 is high, parallel array, values of food
  private String[] toys = new String[] {"string", "ball", "mouse", "spring", "your ankles", "nothing"}; //toys to play with
  private int[] toyVal = new int[] {4, 5, 10, 6, 7, 0}; //1 is low, 10 is high, parallel array, values of toys

  //constructors
  public Cat(){ //default
    super("cat", "Milo");
  }

  public Cat(String name){ //normal
    super("cat", name);
  }

  //methods
  public String[] getFood(){ //returns food array
    return food;
  }

  public int[] getFoodVal(){ //returns value of food
    return foodVal;
  }

  public String[] getToys(){ //returns toy array
    return toys;
  }

  public int[] getToyVal(){ //returns value of toys
    return toyVal;
  }

  public void printFood(){ //printing the food in a list format
    for(int index = 0; index < food.length; index++){
      int num = index+1;
      System.out.print(num + " - ");
      System.out.println(food[index]);
    }
  }

  public void printToys(){ //printing the toys in a list format
    for(int index = 0; index < toys.length; index++){
      int num = index+1;
      System.out.print(num + " - ");
      System.out.println(toys[index]);
    }
  }
  
}
//food initialization
    // food = new String[6];
    // foodVal = new int[6];
    // food[0] = "catnip";
    // foodVal[0] = 2;
    // food[1] = "kibble";
    // foodVal[1] = 5;
    // food[2] = "fish";
    // foodVal[2] = 10;
    // food[3] = "chicken";
    // foodVal[3] = 3;
    // food[4] = "beef";
    // foodVal[4] = 7;
    // food[5] = "turkey";
    // foodVal[5] = 6;
    //toys initialization