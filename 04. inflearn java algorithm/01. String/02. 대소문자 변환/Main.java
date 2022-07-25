/**
 * 대소문자 변환
 * 설명
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로
 * 변환하여 출력하는 프로그램을 작성하세요.
 * 
 * 입력
 * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 * 
 * 출력
 * 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 * 
 * 예시 입력 1 
 * StuDY
 * 
 * 예시 출력 1
 * sTUdy
 */
import java.util.Scanner;

public class Main {

    public String solution(String source){
        String answer = "";
        
        /* 방법1 : Character 이용
        for(char c : source.toCharArray()){
            if(Character.isLowerCase(c)){
                answer += Character.toUpperCase(c);
            }else{
                answer += Character.toLowerCase(c);
            }
        }
        */
        /* 방법2 : 아스키코드 이용 */
        for(char c : source.toCharArray()){
            if( 97 <= c && c <= 122){
                // 대문자 : 97 ~ 122
                // 32를 빼면 같은 소문자
                answer += (char) (c - 32);
            }else if( 65 <= c && c <= 90){
                // 소문자 : 65 ~ 90
                // 32를 더하면 같은 대문자
                answer += (char) (c + 32);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String source = sc.next();
        sc.close();

        Main main = new Main();
        System.out.println( main.solution(source) );
    }
}