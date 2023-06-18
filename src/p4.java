import java.util.Scanner;

public class p4 {
 //   Sum of N natural numbers
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        int num = 0;
        for(int i = 0; i<=t; i++){
            num = num+i;
        }
        System.out.println(num);
    }
}
