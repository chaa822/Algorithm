import java.util.*;

class Main {
    
    public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
        String s = scanner.nextLine();
        String[] arr = s.split("\\.");
        int[] arr2 = new int[arr.length];
        for(int i = 0; i < arr.length; i += 1){
            arr2[i] = Integer.parseInt(arr[i]);
        }
        System.out.printf("%02d-%02d-%04d", arr2[2], arr2[1], arr2[0]);
    }
}