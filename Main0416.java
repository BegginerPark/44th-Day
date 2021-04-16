import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random(); 
    // 반복 질문
    // int n = 0;
    // while (n != 2) {
    //   System.out.print("정수값: ");
    //   int x = sc.nextInt();
      
    //   if (x > 0) {
    //   System.out.println("이 값은 양수입니다.");
    // } else if (x < 0){
    //   System.out.println("이 값은 음수입니다.");
    // } else {
    //   System.out.println("이 값은 0 입니다.");
    // }
    //   System.out.println("다시 하겠습니까?");
    //   System.out.println("1. yes / 2. no");
    //   n = sc.nextInt();
    // }

    // do - while 문 사용
    // int retry;
    // do {
    //   System.out.print("정수값: ");
    //   int x = sc.nextInt();
      
    //   if (x > 0) {
    //   System.out.println("이 값은 양수입니다.");
    //  } else if (x < 0){
    //   System.out.println("이 값은 음수입니다.");
    //   } else {
    //   System.out.println("이 값은 0 입니다.");
    //   }
    //   System.out.println("다시 하겠습니까?");
    //   System.out.println("1. yes / 2. no");
    //   retry = sc.nextInt();
    // } while (retry == 1 );


    // 3자리 양의 정수값 읽는 프로그램 3자리 가 안나오면 반복
    // int x;
    // do {
    //   System.out.print("세 자리의 정숫값: ");
    //   x = sc.nextInt();
    // } while (x < 100 || x >= 1000);
    // System.out.println("입력한 값은 " + x + "입니다.");

    // 숫자 맞추기 게임
    // System.out.println("숫자 맞추기 게임 시작!");
    // System.out.println("10 부터 99 사이의 숫자를 맞추세요");
    // int x = 10 + rand.nextInt(90);
    // int find;

    // do {
    //   System.out.print("어떤 숫자일까요? ");
    //   find = sc.nextInt();
    //   if (find > x) {
    //     System.out.println("더 작은 숫자 입니다.");
    //   } else if (find < x) {
    //     System.out.println("더 큰 숫자 입니다.");
    //   }
    // } while (find != x);
    // System.out.println("정답입니다.");


    // 두 정숫값 사이의 값들을 출력
    // System.out.print("첫번째 정수: ");
    // int x = sc.nextInt();
    // System.out.print("두번째 정수: ");
    // int y = sc.nextInt();
    
    // if (x > y) {
    //   int t = x;
    //   x = y;
    //   y = t;
    // } 

    // do {
    //   System.out.print(x + " ");
    //   x += 1;
    // } while (x <= y);


    // // 카운트 다운
    // System.out.println("카운트다운 합니다.");
    // int n;
    
    // do {
    //   System.out.print("양의 정숫값: ");
    //   n = sc.nextInt();
    // } while (n <= 0);
    // while (n >= 0) {
    //   System.out.println(n--);
    // }
    // System.out.println("n 의 값이 " + n +"이 됐습니다.");

    // 입력한 값의 개수만큼 *을 표시
    // System.out.print("몇 개의 *를 표시할까요? ");
    // int x = sc.nextInt();
    
    // for (int i = 0; x > i; i++) {
    //   System.out.print("*");
    // } 
    // if (x >= 1) {
    //   System.out.print("\n");
    // }

    // 입력한 값의 개수만큼 * 와 + 를 번갈아 가면서 표시
    // System.out.print("몇 개를 표시 할까요? ");
    // int x = sc.nextInt();
    // int i = 0;

    // while (i < x) {
    //   if (i % 2 == 0){
    //     System.out.print("+");  
    //   } else {
    //     System.out.print("*");
    //   }
    //   i++;
    // }
    // if (x >= 1) {
    //   System.out.println();  
    // }


    // 입력한 정수의 자릿수 표시
    // System.out.println("양의 정수값의 자릿수를 표시합니다.");
    // System.out.print("양의 정수값: ");
    // int x = sc.nextInt();
    // // int y = (int)Math.log10(x)+1;
    // int y = 0;

    // while(x >0) {
    //   y++;
    //   x = x /10; // 125.4 -> 12.54 -> 1.254 -> end
    // }
    // System.out.print("입력한 숫자는 " + y + "자리 입니다.");

    // 1 부터 n 까지의 곱
    // System.out.print("양의 정숫값: ");
    // int x = sc.nextInt();
    // int y = 1;
    // int z = 1;

    // while (x >= y) {
    //   z = z*y;
    //   y++;
    // }
    // System.out.print("1부터 " + x + "번째 까지의 곱은" + z + "입니다.");


    // 1부터 n까지의 합
    // System.out.print("n의 값: ");
    // int x = sc.nextInt();
    // int y = 0;

    // for (int i = 0; (x+1) > i; i++) {
    //   y = y + i;
    // }
    // System.out.print("1부터" + x + "까지의 합은 " + y + "입니다.");


    // 계산식 까지 출력
    // System.out.print("n의 값: ");
    // int x = sc.nextInt();
    // int y = 0;

    // for (int i = 0; x > i; i++) {
    //   y = y + i;
    //   System.out.print(i + "+");
    // }
    // System.out.print(x + " = " (sum+x));

    // 신장별 표준 체중 대응표 표준 체중 = (신장 - 100) * 0.9
    
    // System.out.print("몇 cm 부터: ");
    // int x = sc.nextInt();
    // System.out.print("몇 cm 까지: ");
    // int y = sc.nextInt();
    // System.out.print("몇 cm 단위: ");
    // int z = sc.nextInt();
    // double avg;
    // for (int i = z; y > x; z++){
    //   x = x + i;
    //   avg = (x-100)*0.9;
    //   System.out.println(x + " = " + avg);
    // }


    // 약수를 표시
    // System.out.print("정숫값: ");
    // int x = sc.nextInt();
    // int count = 0;
    
    // for (int i = 1; x >= i; i++) {
    //   if (x % i == 0) {
    //     System.out.print(i + " ");
    //     count += 1;
    //   }
    // }
    // System.out.println("\n의 약수는 " + count  + "개 입니다.");

    // 제곱 표시
    // System.out.print("정숫값: ");
    // int x = sc.nextInt();
    // int c = 0;

    // for(int i = 1; x >= i; i++) {
    //   c = i*i;
    //   System.out.println(i + "의 제곱은" + c + "입니다." );
    // }

    // 계정 찾기
    // System.out.println("계절을 찾습니다.");
    // int x;
    // int y;

    // do {
    //   do {
    //     System.out.print("몇 월입니까?");
    //     x = sc.nextInt();

    //    if (x >= 3 && x <= 5) {
    //       System.out.println("봄 입니다.");
    //     } else if (x >= 6 && x <= 8) {
    //       System.out.println("여름 입니다.");
    //     } else if (x >= 9 && x <= 11) {
    //       System.out.println("가을 입니다.");
    //       } else {
    //       System.out.println("겨울 입니다.");
    //     }
    //   }  while(x < 1 || x > 13);
      
    //   System.out.println("다시 하겠습니까? 1. yes / 2. no");
    //   y = sc.nextInt();
    // }while (y == 1); 

    // n단의 정방형을 표시
    // System.out.println("정방형을 표시합니다.");
    // System.out.print("단수는: ");
    // int x = sc.nextInt();
    
    // for (int i = 0; i < x; i++) {
    //   for (int j = 0; j < x; j++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    //* 표시
    // System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
    // System.out.print("단수는? ");
    // int x = sc.nextInt();
    // int count = 0;

    // for (int i = 0; x > i;i++) {
    //   for(int j = 0; i >= j; j++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // System.out.println("왼쪽 위가 직각인 이등변 삼각형을 표시합니다.");
    // for(int i = 0; i < x; i++) {
    //   for(int j = x; j > i; j--) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // System.out.println("오른쪽 위가 직각인 이등변 삼각형을 표시합니다.");
    // for(int i = 0; i < x; i++) {
    //   for(int j = 0; j <= i; j++) {
    //     System.out.print(" ");
    //   }
    //   for(int k = x; k > i; k--){
    //     System.out.print("*");
    //   }
    // System.out.println();
    // }


    // 피라미드
    // System.out.println("피라미드를 표시합니다.");
    // System.out.print("단수는? ");
    // int a = sc.nextInt();
    
    // for (int k =1; k <= a; k++) {
    //   for (int i = a-1; i >= k; i--) {
    //     System.out.print(" ");
    //   }
    //   for (int j = 1; j <= 2*k-1; j++) {
    //     if (a >= 10) {
    //       System.out.print(k % 10);
    //     }else {
    //       System.out.print(k);
    //     }
    //   }
    //   System.out.println();
    // }

    // 소수찾기
    // System.out.print("2이상의 정숫값: ");
    // int x = sc.nextInt();
    // int i;

    // for (i = 2; x > i; i++) {
    //   if(x % i == 0) {
    //     break;
    //   }
    // }

    //   if (i==x) {
    //     System.out.print("소수입니다.");
    //   } else {
    //     System.out.print("소수가 아닙니다.");
    //   }

    // 정숫값을 연속해서 입력
    System.out.println("정수를 더합니다.");
    System.out.print("몇 개를 더 할까요? ");
    int n = sc.nextInt();
    int i;
    int t;
    int sum = 0;

    for(i = 0; n > i; i++) {
      System.out.print("정수(0으로 종료): ");
      t = sc.nextInt();
      if (t == 0) {
        break;
      }
      sum = sum + t;
    }
    System.out.println("합계는 " + sum + " 입니다.");
    System.out.println("평균값은" + sum/i + " 입니다.");
    
  }
}