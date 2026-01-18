public class Dog extends Pet{

  //parallel food
  private String[] food = new String[] {"kibble", "chicken", "cheese", "peanut butter", "pizza", "nothing"};
  private int[] foodVal = new int[] {4, 5, 7, 10, 2, 0};

  //parallel toys
  private String[] toys = new String[] {"ball", "frisbee", "tug-of-war toy", "chew toy", "squeaky toy", "nothing"};
  private int[] toyVal = new int[] {5, 7, 10, 4, 6, 0};

  //constructors
  public Dog(){
    super("dog", "Luna");
  }

  public Dog(String name){
    super("dog", name);
  }

  //methods (same as cat)

  public String[] getFood(){
    return food;
  }

  public int[] getFoodVal(){
    return foodVal;
  }

  public String[] getToys(){
    return toys;
  }

  public int[] getToyVal(){
    return toyVal;
  }

  public void printFood(){
    for(int index = 0; index < food.length; index++){
      int num = index+1;
      System.out.print(num + " - ");
      System.out.println(food[index]);
    }
  }

  public void printToys(){
    for(int index = 0; index < toys.length; index++){
      int num = index+1;
      System.out.print(num + " - ");
      System.out.println(toys[index]);
    }
  }
}