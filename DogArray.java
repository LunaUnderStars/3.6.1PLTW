/*
 * Activity 3.6.1
 */
public class DogArray
{
  public static void main(String[] args)
  {
    Dog[] myDogs;
    Dog[] neighborsDogs;

    myDogs = new Dog[] {new Dog("Fido"), new Dog("Bingo"), new Dog("Martha")};
    neighborsDogs = new Dog[] {new Dog(), new Dog()};

    System.out.println(myDogs[0].getName());
    System.out.println(myDogs[1].getName());
    System.out.println(myDogs[2].getName());

    neighborsDogs[0].setName("Doug");
    neighborsDogs[1].setName("Craig");

    System.out.println(neighborsDogs[0].getName());
    System.out.println(neighborsDogs[1].getName());

    //Initializer lists can only be used when you create the array at declaration time.
    //neighborsDogs = {new Dog("Cinnamon"), new Dog("Mocha")}; // error

    //cannot change the length of the array.
    //neighborsDogs[2] = new Dog("Cocoa"); // error

    //The size of an array is established at the time of creation and cannot be changed.
    //new array fills with null
    
    //neighborsDogs = new Dog[3];
    //System.out.println(neighborsDogs[0].getName()); // error
    //System.out.println(neighborsDogs[1].getName()); // error

    myDogs[2] = null; // gave my puppy to my neighbor!
  }
}