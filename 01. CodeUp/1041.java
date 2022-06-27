import java.util.*;
import java.io.*;

class Main {
    
    public static final Scanner scanner = new Scanner(System.in);
    public static final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
        char c = scanner.next().charAt(0);
        int a = ((int) c) + 1;
        System.out.println( (char) a );
    }
}