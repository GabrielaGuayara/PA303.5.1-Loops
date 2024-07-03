import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String [] args){
        int gcd = 1;
        Scanner inp1 = new Scanner(System.in);
        Scanner inp2 = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n1 = inp1.nextInt();
        System.out.println("Enter a positive integer: ");
        int n2 = inp2.nextInt();


        for(int i = 1; i<= n1 && i<= n2; i++){
            if(n1%i == 0 && n2%i ==0){
                gcd = i;
            }

        }
        System.out.println(gcd);


    }
}
