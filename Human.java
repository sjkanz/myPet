public class Human{
  private Pet animal;
  public Human(){
    animal = new Pet();
  }

  public Human(String petName){
    animal = new Pet(petName);
  }

  public Human(String type, String petName){
    if(type.equals("cat")){
      animal = new Cat(petName);
    }
    else if(type.equals("dog")){
      animal = new Dog(petName);
    }
    else if(type.equals("fish")){
      animal = new Fish(petName);
    }
    else if(type.equals("lizard")){
      animal = new Lizard(petName);
    }
    else{
      animal = new Pet(type, petName);
    }
  }

  public Pet getPet(){
    return animal;
  }
}