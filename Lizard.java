public class Lizard extends Pet{

  //parallel food
  private String[] food = new String[] {"worms", "cupcake", "berries", "crickets", "frozen mixed vegetables", "nothing"};
  private int[] foodVal = new int[] {4, 2, 6, 10, 5, 0};

  //parallel toys
  private String[] toys = new String[] {"rubber ball", "tiny pond", "sunning rock", "floaties", "tunnel", "nothing"};
  private int[] toyVal = new int[] {3, 10, 4, 7, 2, 0};

  public Lizard(){
    super("lizard", "Marian");
  }

  public Lizard(String name){
    super("lizard", name);
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