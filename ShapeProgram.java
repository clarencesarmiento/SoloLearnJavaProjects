import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
    double k = Math.PI;
    int areaofsquare;
    double areaofcircle;
}

class Square extends Shape {
    public Square (int width){
        this.width = width;
    }
    void area(){
        int areaofsquare = (width * width);
        System.out.println(areaofsquare);
    }
}

class Circle extends Shape {
    public Circle (int width){
        this.width = width;
    }
    void area(){
        double areaofcircle = ((k) * width * width);
        System.out.println(areaofcircle);
    }
}
public class ShapeProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}
