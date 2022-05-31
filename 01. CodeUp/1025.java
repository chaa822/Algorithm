import java.util.*;
import java.io.*;

class Main {
    
    public static final Scanner scanner = new Scanner(System.in);
    public static final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();
        int k = 10000;

        while( k > 0 ){
            System.out.println( "[" + (n / k * k) + "]");
            n = n % k;
            k = k / 10;
        }
    }
}