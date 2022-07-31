/**
 * 문장 속 단어
 * 
 * 설명
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 * 
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 * 
 * 출력
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
 * 단어를 답으로 합니다.
 * 
 * 예시 입력 1 
 * it is time to study
 * 
 *  예시 출력 1
 * study
 */
import java.util.Scanner;

class Main {

    public String solution(String input){
        String answer = "";
        String[] arr = input.split(" ");
        int max = 0;

        /* 방법1 */
        for(String s : arr){
            if(s.length() > max){
                max = s.length();
                answer = s;
            }
        }

        /* 방법2 */
        /*
        int pos = 0;
        while( (pos = input.indexOf(' ')) != -1){
            String s = input.substring(0, pos);
            if(s.length() > max){
                max = s.length();
                answer = s;
            }
            input = input.substring(pos + 1);
        }
        if(answer.length() < input.length()){
            answer = input;
        }
        */
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        Main main = new Main();
        System.out.println( main.solution(input) );
    }
}