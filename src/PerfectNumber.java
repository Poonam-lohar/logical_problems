import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
    int n = sc.nextInt();
    int i=1;
    int sum=0;
    while (i<=n/2) {
        if (n % i == 0) {
            sum = sum + i;
        }
        i++;
    }
    if (sum==n)
    {
        System.out.println(n+ " perfect number");
    }
    else
        System.out.println(n+"  not perfect number");
    }
}
