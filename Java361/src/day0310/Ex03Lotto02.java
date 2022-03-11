package day0310;
// 로또 번호 추첨기 ver 2.0
// 배열을 사용한 버전

import java.util.Random;
public class Ex03Lotto02 {
    public static void main(String[] args) {
        // 로또 최소수
        final int LOTTO_MIN = 1;
        // 로또 최대수
        final int LOTTO_MAX = 45;
        // 뽑을 숫자
        final int MAX_LENGTH = 6;
        
        // 랜덤 숫자를 뽑을 때 사용할 Random 클래스 변수
        Random random = new Random();
        
        // 랜덤 숫자를 저장할 int 배열 선언
        int[] lottoNumbers = new int[MAX_LENGTH];
        
        // for문을 사용해서 lottoNumbers의 각 인덱스변 칸에
        // 랜덤 숫자를 저장한다.
        // 단, 만약 해당 숫자를 우리 배열에서 찾을 수 있는 경우,
        // 새로운 숫자를 뽑아서 저장하게 만들어준다.
        
        for(int i = 0; i < lottoNumbers.length;) {
            // 1. 랜덤 숫자를 하나 뽑아서 임시로 변수에 저장한다.
            int temp = random.nextInt(LOTTO_MAX) + LOTTO_MIN;
            
            // 2. 중복된 숫자를 찾으면 false 못찾으면 true가 저장될 boolean 변수를 저장한다.
            boolean numberSwitch = true;
            
            // 3. j for문을 사용하여 만약 j번째 인덱스의 값과 temp의 값이 같으면
            //    numberSwitch를 false로 바꿔준다.
            for(int j = 0; j < i; j++) {
                if(temp == lottoNumbers[j]) {
                    numberSwitch = false;
                }
            }
            
            // 4. 만약 boolean 변수의 값이 true 이면 i번 인덱스에 임시 변수의 값을 저장하고
            //    i를 1 증가시킨다.
            if(numberSwitch) {
                lottoNumbers[i] = temp;
                i++;
            }
            
        }
        
        // 정렬 전의 중복이 없는 로또 번호 목록을 출력한다.
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.printf("lottoNumbers[%d]: [%d]\n", i, lottoNumbers[i]);
        }
        
        // 정렬하는 코드
        // 이때에는 우리가 0번칸과 1번칸, 1번칸과 2번칸, 2번칸과 3번칸, 3번칸과 4번칸, 4번칸과 5번칸
        // 을 묶어서 비교하여 만약 뒤의 칸이 더 작으면 순서를 바꿔주고
        // 다시 처음부터 검사할 수 있게 i를 -1로 바꾸어준다.
        
        for(int i = 0; i < lottoNumbers.length -1; i++) {
            if(lottoNumbers[i] > lottoNumbers[i+1]) {
                // i번쨰 칸의 값을 int temp에 저장
                int temp = lottoNumbers[i];
                // i번째 칸에 i+1번쨰 칸의 값을 저장
                lottoNumbers[i] = lottoNumbers[i+1];
                // i+1번쨰 칸에 temp의 값을 저장
                lottoNumbers[i+1] = temp;
                // 이 다음에 실행할 코드는 i++이므로
                // i++ 후에 i가 0이 될수 있게
                // i를 -1로 초기ㅗ하
                i = -1;
            }
        }
        
        // 정렬 후의 결과를 출력한다.
        System.out.println("----------------------정렬후--------------------------");
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.printf("lottoNumbers[%d]: [%d]\n", i, lottoNumbers[i]);
        }
    }
    
    

}
