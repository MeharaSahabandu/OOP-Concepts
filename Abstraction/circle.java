package Abstraction;

public class circle extends shape {
    double radius;

    public circle(String color, double radius){
        super(color);
        System.out.println("Circle constructor called");
        this.radius=radius;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius, 2);
    }

    public String toString(){
        return "Circle color is "+super.color+" and area is : "+area();
    }
    
}
