
package dynamic_programming;
import java.math.BigInteger;
import java.util.Scanner;
public class Tugas01 {
    private static void main(String[] args) {
        String identitas = "Krisvany Afril Patricia/X RPL 3/17";
        tampilJudul(identitas);
        int n = tampilInput();
        BigInteger hasil = fibo(n);
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
  private  static BigInteger fibo(int n) {
      
      BigInteger[] hasil  = new BigInteger[n];
      
      hasil[0] = BigInteger.ONE;
      hasil[1] = BigInteger.ONE;
      
      for (int i = 2; i< n;i++) {
          hasil[i] = hasil[i-1].add(hasil[i-2]);
      }
      return hasil[n-1];
  }
    
}
