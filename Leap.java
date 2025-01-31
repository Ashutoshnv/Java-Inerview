
import java.util.Scanner;

class Leap
{
    public static void main(String[] args) 
    {
        int year;
        Scanner sc =new Scanner(System.in);
        System.out.println("Check Leap Year: ");
        year=sc.nextInt();
        if ((year % 400==0) ||(year % 4==0 && year % 100!=0))
        {
            System.out.println(+year+" It is leap Year");
        }
        else
        {
            System.out.println(+year+" It is not a leap year");
        }
    }
}