import java.util.Scanner;
public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num: ");
        long binary = scanner.nextInt();
        int octal = 0, decimal = 0, i = 0;
        while (binary != 0) {
            decimal += (binary % 10) * Math.pow(2, i);
            ++i;
            binary /= 10;
        }
        i = 1;
        while (decimal != 0) {
            octal += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }
        System.out.println(+octal);
    }
}
