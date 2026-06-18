//run this program using javac counter.java - > Java Counter
class Counter {
    //uncomment the bellow lines to know the imortance of static keyboard

    static int number=10;

    //static int number=10;
    void increment(){
        number=number+1;
    }

   public static void main(String[] args) {
    Counter obj1=new Counter();
    Counter obj2=new Counter();
    Counter obj3=new Counter();
    //guess the ans
    obj1.increment();
    obj2.increment();
    obj3.increment();

    //to cheak your nas uncomment the next lines

    System.out.println(obj1.number);
    System.out.println(obj2.number);
    System.out.println(obj3.number);
   }
}