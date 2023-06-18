import java.util.Scanner;
//Even or Odd number
public class p2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int x = in.nextInt();
            if(x%2==0){
                System.out.println("Even");
            }
            else System.out.println("Odd");
        }


    }

}
