import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double mpg = 0;
        double pricePG = 0;
        double hundred;
        double distance;

        System.out.print("How many gallons of gas are in your vehicle?: ");
        if (in.hasNextDouble())
        {
            gallons = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println("That is not a correct input!");
        }
        //-------------------------------------------------------------------

        System.out.print("How many miles per gallon does your car get?: ");
        if (in.hasNextDouble())
        {
            mpg = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println("That is not a correct input!");
        }
        //--------------------------------------------------------------------

        System.out.print("How much do you pay for 1 gallon of gas?: ");
        if (in.hasNextDouble())
        {
            pricePG = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println("That is not a correct input!");
        }
        //---------------------------------------------------------------------

        hundred = (100/mpg)*pricePG;
        System.out.println("The cost per 100 miles is: $" + hundred);

        distance = gallons * mpg;
        System.out.println("you can drive " + distance + " more miles until you need to get gas!");


    }
}