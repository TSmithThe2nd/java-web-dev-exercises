package areaOfRectangle;

import java.util.Scanner;

public class area {
    public  static void main(String[] args){
//        bring in scanner class
        Scanner input = new Scanner(System.in);
//collect user inputs for width and length
        System.out.println("Enter the length: ");
        Integer length = input.nextInt();

        System.out.println("Enter the width: ");
        Integer width = input.nextInt();
//combine length and  width
        Integer area = width * length;
//output final result.
        System.out.println("Area of rectangle is: "+area);
    }
}
