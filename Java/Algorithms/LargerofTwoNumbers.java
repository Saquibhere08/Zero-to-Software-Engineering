/*
Algorithm:
1.start
2.if(a>b) then larger -> a;
3.else
    larger -> b;
4.end
*/
package Java.Algorithms;

import java.util.Scanner;

public class LargerofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();

        int larger=findLarger(a, b);
        System.out.println("Larger of "+a+" & "+b+" is: "+larger);
        
    }

    public static int findLarger(int a,int b){
        if(a>b){
        return a;
        }
        else return b;
    }
}
