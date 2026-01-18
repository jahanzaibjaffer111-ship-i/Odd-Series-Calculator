import java.util.Scanner;
public class odd_series_calc_using_while
{
    public static void main(String[] args)
    {
        try (Scanner read = new Scanner(System.in)) {
            int a,b;
            while(true)
            {
                System.out.println("Hello");
                System.out.println("Welcome to Odd Series Calculator");
                System.out.println("Type Starting Value");
                a=read.nextInt();
                System.out.println("Type Ending Value");
                b=read.nextInt();
                System.out.println("Values are");
                    if (a%2==0)
                    {
                        a++;
                    }
                    while(a<=b)
                        {
                            System.out.println(a);
                            a=a+2;
                        }
                    System.out.println("Thank you");
                    System.out.println("Bye");
                    System.out.println(".");
                }
        }
    }

}
