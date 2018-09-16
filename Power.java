import java.util.*;
public class Power {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num = 2;
        int pow = 0;
        int power = 0;

        System.out.println("Power is 2");

        System.out.print("Enter power: ");
        pow = sc.nextInt();

        System.out.print(power(pow));
        System.out.println();
    }
    public static int power(int b)
    {
            int power = 1;
            for(int c=0;c<b;c++)
            power*=2;
            return power;
        }

}