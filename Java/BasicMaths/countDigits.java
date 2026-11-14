package Java.BasicMaths;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        int count=countDigit(n);
        System.out.println("Total Count: "+count);
    }
    public static int countDigit(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
}
