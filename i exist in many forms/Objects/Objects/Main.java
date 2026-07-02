//this program is created to teach the concept of abstraction
abstract class Objects{
    //asbtract method declaration
    abstract void showShape();
    public void shape(){
        System.out.println("I'm form abstract class");
    }
}

class Sphere extends Objects{
    /**
     * This is inderctly a overriden showshape method by making use of abstract class
     */
    void showShape(){
        System.out.println("Object type is Sphere.");
    }
}

class Cuboid extends Objects{
    /**
     * This is inderctly a overriden showshape method by making use of abstract class
     */
    void showShape(){
        System.out.println("Object type is Cuboid.");
    }
}
class Prism extends Objects{
    /**
     * This is inderctly a overriden showshape method by making use of abstract class
     */
    void showShape(){
        System.out.println("Object type is Prism.");
    }
}
public class Main{
    public static void main(String[] args) {
        Objects obj = new Sphere(); //object of sphere
        obj.showShape();
        obj = new Cuboid();
        obj.showShape();
        obj=new Prism();
        obj.showShape();
        obj.shape();
    }
}

