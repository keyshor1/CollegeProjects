import java.util.Scanner;

public class ElectricityBill1
{
    public static void main(String[]args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number of units + :");
        Integer total_units = myObj.nextInt();
        int min_charge = 100;
        int units;
        int total_amount = 0;

        if (total_units<=10)
        {
            System.out.println("You should have to pay Rs" + min_charge + " only.");
        }
        else if (total_units>=11 && total_units<=50)
        {
            units = total_units - 10;
            total_amount = min_charge + (units * 5);
            System.out.println("You should have to pay Rs" + total_amount + " only.");
        }
        else if (total_units>=51 && total_units<=200)
        {
            units = total_units - 10 - 40;
            total_amount = min_charge + 200 + (units * 10);
            System.out.println("You should have to pay Rs" + total_amount + " only.");
        }
        else if (total_units>=200 && total_units<=500)
        {
            units = total_units - 10 - 40 - 150;
            total_amount = min_charge + 200 + 1500 + (units * 15);
            System.out.println("You should have to pay Rs" + total_amount + " only.");
        }
        else if (total_units>500)
        {
            units = total_units - 10 - 40 - 150 - 300;
            total_amount = min_charge + 200 + 1500 + 4500 + (units * 20);
            System.out.println("You should have to pay Rs" + total_amount + " only.");
        }
        else
        { System.out.println("Please insert valid input.");
        }
    }
}