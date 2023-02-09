package Inheritance;

public class mountainBike extends bicycle{

    public int seatHeight;

    public mountainBike(int gear, int speed, int startHeight){
        super(gear, speed);
        seatHeight=startHeight;
    }

    public void setHeight(int newValue){
        seatHeight=newValue;
    }

    public String toString(){
        return(super.toString()+"\nseat height is : "+seatHeight);
    }

} 
    

