import java.io.*;

/**
 * Created by Marina on 04.12.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a = ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Enter b = ");
        double b = Double.parseDouble(br.readLine());
        System.out.print("Enter h = ");
        double h = Double.parseDouble(br.readLine());

        System.out.println("x\t\t|f(x)");
        System.out.println("----------------------------------");
        for(double i = a; i<=b; i=i+h){
            System.out.print(i + "\t|" + func(i));
            System.out.println();
        }
    }

    private static double func(double x){
        return Math.tan(2.0*x)-3;
    }
}
