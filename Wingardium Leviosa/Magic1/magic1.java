// The collections framework is definded in the java.util package
import java.util.ArrayList;
class Main {
    public static void main(String[] args){
        //creating an object of arraylist
        ArrayList<String> animals = new ArrayList<>();
        //add elements
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Leopard");
        animals.add("Cat");
    System.out.println("---------------Priting Current Array---------------");
        System.out.println(animals);
    animals.clear();
    System.out.println("---------------Priting Cleared Array---------------");
    System.out.println("Empty Array : " + animals);
    if (animals.isEmpty()){
        System.out.println("Array is empty");
    }
    else{
        System.out.println("Array is empty");
    }
    animals.add("Lion");
    animals.add("Tiger");
    animals.add("Leopard");
    animals.add("Cat");
    System.out.println("The size of Array" + animals.size());
    System.out.println("Adding more element" + animals.add("dog"));
    System.out.println(animals);
    animals.remove(2); //removes the string at
    System.out.println(animals);
    }
}