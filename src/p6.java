import java.util.Scanner;

//Java Program to Find Greatest of Two Numbers
public class p6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        if(n1 > n2) System.out.println(n1);
        else if(n2 > n1) System.out.println(n2);
        else System.out.println("Equal");


    }
}
