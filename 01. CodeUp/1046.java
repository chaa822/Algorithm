import java.util.*;
import java.io.*;

class Main {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
	    int a = scanner.nextInt();
	    int b = scanner.nextInt();
	    int c = scanner.nextInt();
	    System.out.println( a + b + c );
	    System.out.printf( "%.1f", (double) (a+b+c)/3);
	}
}