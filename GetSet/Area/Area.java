// A sample class shape which provides a method to get hte shapes
class Shape{
    public double getArea(){
        return 0;
    }
}
//A triangle with base and height
class Triangle extends Shape { //extended from the shape class
    private double base;
    private double height;
    public Triangle(double base , double height){
        this.base = base;
        this.height=height;
    }
    public double getArea(){ //area of triangle 1/2*b*h
        //area using herons formula can be also used here
        return 0.5 * base * height ;
    }
}
//A square is shape with a specific side
class Square extends Shape{
    private double side;
    public Square(double side){
        this.side=side;
    }
    public getArea(){
        return side * side;
    }
}
class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2]; //creating shape array of size 2 
        //instead of hardcoding the input we can take input from user also
        //a switch case could be created press 1 for area of square press 2 for area of triangle

        shape[0]=new Square(5); //creating circle object at index 0
        shape[1]= new Triangle(2,2); //creating retangle object at index 1
        //shape obj is calling children classes method
        System.out.println("Area of the square " + shape[0].getArea());
        System.out.println("Area of the Triangle " + shape[1].getArea());
    }
}