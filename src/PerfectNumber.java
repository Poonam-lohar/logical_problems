import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int a=sc.nextInt();
        int i=1;
        while (i<=a/2)
        {
            if (a%i==0)
            {
                sum=sum+i;
            }
            i++;
        }
        if (sum==a)
        {
            System.out.println(a+" perfect number");
        }
        else
            System.out.println(a+" not perfect number");
    }
}
