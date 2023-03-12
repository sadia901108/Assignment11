
package basic.anisulvideo2;
import java.util.Scanner;
public class AnisulAssignmrnt11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n, fact=1;
        System.out.print("Enter any integer number to calculate factorial:");
        n=input.nextInt();
        for(int i=1; i<=n; i++)
            fact=fact*i;
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
