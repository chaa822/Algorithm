import java.util.*;
import java.io.*;

class Main {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
	    int a = scanner.nextInt();
        int n = scanner.nextInt();
        int total = 1;
        for(int i = 0; i < n; i += 1){
            total = total * 2;
        }
        System.out.println( total * a );
	}
}