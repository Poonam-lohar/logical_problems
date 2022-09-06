import java.util.Scanner;
public class OctalToDecimal {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter a octal number: ");//140
            int octal= scanner.nextInt();
            int decimal=0;
            int n=0;
            while(octal > 0)
            {
                int temp = octal%10;//digit
                decimal += temp*Math.pow(8, n);
                octal = octal/10;
                n++;
            }
            System.out.println("decimal of number is: "+decimal);
        }
    }
