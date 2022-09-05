import java.util.Scanner;
public class HighestCommonFactor {
    public static void main(String args[]){
        int a, b, i, hcf = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        a = sc.nextInt();
        System.out.println("Enter number2: ");
        b = sc.nextInt();
        for(i = 1; i <= a || i <= b; i++) {
            if( a%i == 0 && b%i == 0 )
                hcf = i;
        }
        System.out.println("HCF of given two numbers is: "+hcf);
    }
}
