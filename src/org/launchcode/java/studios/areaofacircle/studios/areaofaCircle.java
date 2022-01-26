package org.launchcode.java.studios.areaofacircle.studios;
import java.util.Scanner;


public class areaofaCircle {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the radius: ");
        double radius=input.nextDouble();



        double area= circle.getArea(radius);

        System.out.println("The area of the "+radius+ " is: "+area);



    }
}
