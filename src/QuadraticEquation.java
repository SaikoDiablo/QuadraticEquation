 import java.util.Scanner;
 
public class QuadraticEquation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter coefficient a: ");
            float a = scanner.nextFloat();
            
            if (a == 0) {
                System.out.println("Coefficient 'a' cannot be zero. This is not a quadratic equation.");
                return;
            }
            
            System.out.print("Enter coefficient b: ");
            float b = scanner.nextFloat();
            
            System.out.print("Enter coefficient c: ");
            float c = scanner.nextFloat();
            
            
            double delta = Math.pow(b, 2) - 4 * a * c;
            int numberOfRoots;
            
            if (delta < 0) {
                numberOfRoots = 0;
            } else if (delta == 0) {
                numberOfRoots = 1;
            } else {
                numberOfRoots = 2;
            }
            
            
            switch (numberOfRoots) {
                case 0 -> System.out.println("No real roots exist.");
                case 1 -> {
                    float x1 = (float)(-b / (2 * a));
                    x1 = Math.round(x1 * 100f) / 100f;
                    System.out.println("One real root exists:");
                    System.out.println("x1 = " + x1);
                }
                case 2 -> {
                    float sqrtDelta = (float)Math.sqrt(delta);
                    float x1_2 = (float)((-b - sqrtDelta) / (2 * a));
                    float x2_2 = (float)((-b + sqrtDelta) / (2 * a));
                    x1_2 = Math.round(x1_2 * 100f) / 100f;
                    x2_2 = Math.round(x2_2 * 100f) / 100f;
                    System.out.println("Two real roots exist:");
                    System.out.println("x1 = " + x1_2);
                    System.out.println("x2 = " + x2_2);
                }
            }
            
            a = Math.round(a * 100f) / 100f;
            b = Math.round(b * 100f) / 100f;
            c = Math.round(c * 100f) / 100f;
            
            System.out.println("\nCoefficients:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
        }
    }
}

