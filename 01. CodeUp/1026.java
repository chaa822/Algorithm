import java.util.*;
import java.io.*;

class Main {
    
    public static final Scanner scanner = new Scanner(System.in);
    public static final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
        String s = scanner.next();
        String[] arr = s.split("\\:");
        System.out.printf( "%d", Integer.parseInt(arr[1]) );
    }
}