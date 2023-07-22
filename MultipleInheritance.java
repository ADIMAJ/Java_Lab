package javalab;
import java.util.Scanner;


interface vehicleone{
int speed=90;
public void distance();
}

interface vehicletwo{
int distance=100;
public void speed();
}
class Vehicle implements vehicleone,vehicletwo{
public void distance(){
int distance=speed*100;
System.out.println("distance travelled is "+distance);
}
public void speed(){
int speed=distance/100;
}
}
class MultipleInheritanceUsingInterface{
public static void main(String args[]){
System.out.println("Vehicle");
Vehicle obj = new Vehicle();
obj.distance();
obj.speed();
}
}
