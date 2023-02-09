package Encapsulation;

public class area {

    private int length;
    private int breadth;

    public area(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }

    public void setLength(int length){
        this.length=length;
    }

    public void setBreadth(int breadth){
        this.breadth=breadth;
    }

    public void getArea(){
        int area =  length*breadth;
        System.out.println("Area of rectangle is : "+area);
    }
    
}
