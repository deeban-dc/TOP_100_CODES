import java.util.Scanner;
//Sum of First N Natural numbers
public class p3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int num = 0;
        for(int i = 1; i<=t; i++){
                num = num + i;
        }
        System.out.println(num);
    }

}
