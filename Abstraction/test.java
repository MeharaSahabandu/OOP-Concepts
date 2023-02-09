package Abstraction;

public class test {

    public static void main(String[] args){

        shape s1= new circle("red", 2.2);
        shape s2= new rectangle("blue", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
    
}
