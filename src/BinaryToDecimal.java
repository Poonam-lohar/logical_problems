import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a binary number: ");//1010
        int binary= scanner.nextInt();
        int decimal=0;
        int n=0;
        while(binary > 0)
        {
            int temp = binary%10;//digit
            decimal += temp*Math.pow(2, n);
            binary = binary/10;
            n++;
        }
        System.out.println("decimal of number is: "+decimal);
    }
}
