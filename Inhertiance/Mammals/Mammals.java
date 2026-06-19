//this activity is mainly to explain Hierarchical inhertiance
//parent class
class Mamalas{
    void mam(){
        System.out.println("Inside Mammals Class");
    }
}
//child class
class Lion extends Mamalas{
    void roar(){
        System.out.println("Inside Lion Class");
    }
}
//child class
class Human extends Mamalas{
    void hum(){
        System.out.println("Inside Human ");
    }
}

class Main{
    public static void main(String[] args) {
        Lion obj=new Lion();//object of child of child calss
        obj.hum(); //this will result in error to run this we have to create object of human
        obj.roar(); 
        obj.mam();
    }
}
