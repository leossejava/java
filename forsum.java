import java.util.*;

 class forsum
 {
    public static void main(String args[]) 
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("The sum of the series is: " + sum);
    }
}