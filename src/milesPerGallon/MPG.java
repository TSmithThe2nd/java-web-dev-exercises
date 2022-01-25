package milesPerGallon;
import java.util.Scanner;

public class MPG {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        System.out.println("How many miles did you drive? ");
        Integer miles= input.nextInt();

        System.out.println("How many gallons did you use? ");
        Integer gallons= input.nextInt();

        Integer mpg= miles/gallons;

        System.out.println(mpg);

    }
}
