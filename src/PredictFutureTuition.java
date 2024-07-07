import java.util.Scanner;

public class PredictFutureTuition {
    public static void main(String[] args){
        double tuition = 10000;
        double doubleTuition = tuition * 2;
        int years = 0;

        while (tuition < doubleTuition) {
            tuition = tuition * 1.07;
            years++;
        }

        System.out.println(years);
    }
}
