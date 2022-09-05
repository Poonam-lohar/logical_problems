import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int i;
        int total=0;
        int temp=n;
        int fact,lastdig;
        while (n!=0)
        {
            i=1;
            fact=1;
            lastdig=n%10;
            while (i<=lastdig) {
                fact = fact * i;
                i++;
            }
            total=total+fact;
            n=n/10;
            }
        if (total==temp)
            System.out.println(temp + "  strong number");
        else
            System.out.println(temp+"  not strong number");
        }

    }
