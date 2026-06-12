import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello user please enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter your lucky number ");
        int lucky=sc.nextInt();
        System.out.println("Hello "+name+", Your lucky number "+lucky+" shows your lucky number isnt lucky lmao . You cant keep it up");;
    }
}