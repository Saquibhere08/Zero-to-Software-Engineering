package Java.patterns;

public class Pattern7 {
    public static void main(String[] args) {
    int n=4;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){ //spaces
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){ //stars
            System.out.print("*");
        }
        System.out.println();
    }

    }
}
