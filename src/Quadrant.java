import java.util.Scanner;
public class Quadrant {
        public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int x = sc.nextInt();
            System.out.println("Enter the second number: ");
            int y = sc.nextInt();
            if(x>0 && y>0)
                System.out.println("Quadrant 1");
            else if(x<0 && y>0)
                System.out.println("Quadrant 2");
            else if(x<0 && y<0) System.out.println("Quadrant 3");
            else if (x > 0 && y < 0)
                System.out.println("Quadrant 4");
            else if (x == 0 && y == 0)
                System.out.println("Origin");
            else if (y==0 && x!=0)
                System.out.println("on x-axis");
            else if (x==0 && y!=0)
                System.out.println("on y-axis");

        }
    }
