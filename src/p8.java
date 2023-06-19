import java.util.Scanner;

//Java Program to Check Leap Year or not
public class p8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        if(t%400==0) System.out.println("Leap Year");
        else if(t%4==0 && t%100!=0) System.out.println("Leap Year");
    }

}
