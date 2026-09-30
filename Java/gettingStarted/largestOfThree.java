package Java.gettingStarted;

import java.util.Scanner;

public class largestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        System.out.println("Enter c: ");
        int c=sc.nextInt();

        int result=findGreatest(a, b, c);
        System.out.println("Greatest of 3: "+result);

    }

    public static int findGreatest(int a , int b, int c){
        if(a>b&& a>c){
            return a;
        }else if(b>a&&b>c){
            return b;
        }else
            return c;
    }
}
