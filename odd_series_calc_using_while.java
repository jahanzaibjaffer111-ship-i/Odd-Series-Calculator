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
                System.out.println("welcome to odd series calc");
                System.out.println("type starting value");
                a=read.nextInt();
                System.out.println("type ending value");
                b=read.nextInt();
                if (a!=b)
                    {
                        System.out.println("Values are");
                    if (a<b)
                    {
                        if (a%2==0)
                        {
                            a++;
                        }
                        while(a<=b)
                        {
                            System.out.println(a);
                            a=a+2;
                        }
                    }
                    else if (a>b)
                    {
                        if (a%2==0)
                        {
                            a--;
                        }
                        while(a>=b)
                        {
                            System.out.println(a);
                            a=a-2;
                        }
                    }
                    System.out.println("thanks");
                    System.out.println("bye");
                    System.out.println(".");
                }
                if (a==b)
                {
                    System.out.println("starting and ending value cant be same");
                    System.out.println("try again");
                    System.out.println(".");
                }
            }
        }
    }
}



