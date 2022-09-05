import java.util.Scanner;
public class PerfectSquare {
    static boolean Perfectsquare(double num)
    {
        double sqrt=Math.sqrt(num);
return ((sqrt-Math.floor(sqrt))==0);
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number: ");
     double num = sc.nextDouble();
     if (Perfectsquare(num))
         System.out.println("Number is perfect square");
     else
         System.out.println("not perfect square");
 }
}
