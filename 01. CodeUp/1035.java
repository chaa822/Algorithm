import java.util.*;
import java.io.*;

class Main {
    
    public static final Scanner scanner = new Scanner(System.in);
    public static final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
        // int n = scanner.nextInt();
        String s = scanner.next();
        int a = Integer.parseInt(s, 16);
        System.out.printf("%o", a);
    }
}