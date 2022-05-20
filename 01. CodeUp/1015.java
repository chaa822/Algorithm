import java.util.*;
import java.io.*;

class Main {
    
    public static final Scanner scanner = new Scanner(System.in);
    public static final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
        float f = scanner.nextFloat();
        System.out.printf("%.2f", f);
    }
}