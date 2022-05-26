import java.util.*;
import java.io.*;

class Main {
    
    public static final Scanner scanner = new Scanner(System.in);
    public static final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
        String s = scanner.nextLine();
        char[] arr = s.toCharArray();
        for(char c : arr){
            System.out.printf("%s", c);
        }
    }
}