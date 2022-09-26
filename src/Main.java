
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double Length = 0;
        double Width = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("What is your length in cm");
        if (in.hasNextDouble())
        {
            Length = in.nextInt();
            Scanner in2 = new Scanner(System.in);
            System.out.println("What is your width in cm ");
                if (in2.hasNextDouble()) {
                    Width = in2.nextDouble();
                    System.out.println("The perimeter of the rectangle is " + (2*Length + 2*Width));
                    System.out.println("The area is " +(Length*Width) );
                    System.out.println( "The diagonal length is " + ( Math.sqrt( (Math.pow(Length,2) + Math.pow(Width,2) ) ) ) );
                }
                else
                {
                    System.out.println("invalid input try again");
                }

        }
        else
        {
            System.out.println("invalid input try again");
        }
    }
}