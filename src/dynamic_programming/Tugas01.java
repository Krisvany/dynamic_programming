
package dynamic_programming;
import java.util.Scanner;
public class Tugas01 {
    private static void main(String[] args) {
        String identitas = "Krisvany Afril Patricia/X RPL 3/17";
        tampilJudul(identitas);
        int n = tampilInput();
    }
    public static void tampilJudul(String identitas) {
        System.out.println("Identitas :" + identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
        
        
    }
    private static int tampilInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bilangan ke-:");
        int n = scanner.nextInt();
        
        return n;
        
    }
    
}
