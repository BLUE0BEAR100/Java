//guess is it runtime or compile time polymorphism
class Hillistations{
    void location(){
        System.out.println("Location is:");
    }
    void famousfor(){
        System.out.println("Famous for:");
    }
}
class Bandarban extends Hillistations {
    void location(){
        System.out.println("Bandarban is in Chottogram Division");
    }
    void famousfor(){
        System.out.println("It is famous for untouched natural beauty");
    }
}
class Rangamati extends Hillistations {
    void location(){
        System.out.println("Rangamati is in Chottogram Division too");
    }
    void famousfor(){
        System.out.println("It is famous for Mountains beauty");
    }
}
class Khagrachari extends Hillistations {
    void location(){
        System.out.println("Khagrachari is in Chottogram Division too");
    }
    void famousfor(){
        System.out.println("It is famous for Mountains beauty");
    }
}
class Main{
    public static void main(String args[]){
        Hillistations A = new Hillistations();
        Hillistations B = new Bandarban();
        Hillistations Ra = new Rangamati();

        Hillistations Kh = new Khagrachari();

        A.location();
        A.famousfor();

        B.location();
        B.famousfor();

        Ra.location();
        Ra.famousfor();

        Kh.location();
        Kh.location();
    }
}
