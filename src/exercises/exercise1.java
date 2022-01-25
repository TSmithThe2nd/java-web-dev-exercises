package exercises;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args){
       Scanner input= new Scanner(System.in);

       System.out.println("Hell, what is your name: ");

       String name= input.nextLine();

       System.out.println("Hello "+ name);

    }
}
