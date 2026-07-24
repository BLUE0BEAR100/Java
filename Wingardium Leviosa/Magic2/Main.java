import java.util.ArrayList;

public class Main{
    public static void main (String[] args) {
        System.out.println("======Lamdas======");
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(35);
        numbers.add(38);
        numbers.add(34);
        numbers.add(30);
        numbers.add(68);
        numbers.add(67);
        numbers.forEach(  (x)  -> {System.out.println(x);});
    numbers.forEach(n -> {if (n==67) System.out.println("Found 67");});
    }
}