import java.util.Scanner;

public class GalToLit {

    public static void main(String[] args) {
        try (// declare variables
        Scanner in = new Scanner(System.in)) {
            double gallons;
            double liters=0;

            System.out.print("Masukkan jumlah galon: ");
            gallons = in.nextDouble();
            
            // add your calculation here
            liters = gallons * 3.785;
            //output the result to user
            System.out.println(gallons+" gallons equals "+liters+" liters");
        }
    }
}