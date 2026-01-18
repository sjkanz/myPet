public class Fish extends Pet{

  //parallel food
  private String[] food = new String[] {"kelp", "algae", "worms", "insects", "peas", "nothing"};
  private int[] foodVal = new int[] {3, 5, 4, 7, 10, 0};

  //parallel toys
  private String[] toys = new String[] {"food", "target", "ping-pong ball football", "tube", "leaf hammock", "nothing"};
  private int[] toyVal = new int[] {8, 5, 10, 3, 6, 0};

  //constructors
  public Fish(){
    super("fish", "Fishy");
  }

  public Fish(String name){
    super("fish", name);
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