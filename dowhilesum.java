import java.util.*;

 class dowhilesum
 {
    public static void main(String args [])
 {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        double sum = 0.0;
        int i = 1;
        do {
            sum += 1.0 / i;
            i++;
        } while (i <= n);
        System.out.println("The sum of the series is: " + sum);
    }
}