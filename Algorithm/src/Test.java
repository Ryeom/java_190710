import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// 블로그에 올리지말것
		// 1. 자바 표준타입 총 8가지 작성
		// byte : 1byte
		// boolean : 1byte
		// char :2byte
		// short : 2byte
		// int :4byte
		// long :4byte
		// float :4byte
		// double :8byte
		// 2. 5단만 출력 2-1
		int i;
//		for (int i = 0; i < 10; i++) {
//			System.out.println("5 X "+i+" = "+i*5);
//		}
//		for (int i = 0; i < 10; i++) {
//			System.out.printf("5 X %d = %d\n",i,i*5);
//		}
		// 2 - 2
		// printf를 썼을 경우
		// 1부터 100까지 합산 프로그램 //TODO
//		int i=0,result=0;
//		for (i = 1; i <= 100; i++) {
//			result+=i;
//		}
//		System.out.println(i);

		// 3. 키보드로부터 숫자를 입력받는 코드
//		Scanner sc = new Scanner(System.in);
//		int inputInt = sc.nextInt();

		// 5 - 1. 0부터 100사이의 숫자를 랜덤하게
//		for ( i = 0; i < 10; i++) {
//			int random1 = (int)(Math.random()*100)+1;
//			System.out.print(random1+" ");
//		}System.out.println();
//		//  - 2. 50부터 100사이의 숫자를 랜덤하게 10개출력
//		for (i = 0; i < 10; i++) {
//			int random2 = (int)(Math.random()*50)+50;
//			System.out.print(random2+" / ");			
//		}System.out.println();
//		//  - 3. -10부터 +10사이의 숫자를 랜덤하게 10개출력	
//		for (i = 0; i < 10; i++) {
//			float random3 = (int)(Math.random()*10)-10;
//			System.out.print(random3+" / ");			
//		}System.out.println();
//		//  - 4. 0.0부터 1.0사이의 숫자를 랜덤하게 10개출력	//TODO
//		for (i = 0; i < 10; i++) {
//			float random3 = (float) (Math.random()*1.0);
//			System.out.print(String.format("%.3f", random3)+" / ");			
//		}
//		System.out.println();
//		//  - 5. 0부터 100사이의 숫자중 4의 배수만 랜덤하게 출력
//		int resultInt, cnt=0;
//		while(cnt!=10) {
//			resultInt = (int)(Math.random()*100)+0;
//			if(resultInt!=0&&resultInt%4==0){
//				System.out.print(resultInt+" ");
//				cnt++;
//			}
//		}
//		System.out.println();
//		
		// 6. 3의 4승 혹은 2의 7승을 구해주는 스태틱 함수를 만드세요 (지수)
//		System.out.println(square(2, 11));

		// 7. n! n팩토리얼 함수를 만드세용(단, 재귀함수를 사용할 것)
//		System.out.println(factorial(7));
		// 8. 피보나치 수 30자리를 출력하세요
		// ex. 0.1.1.2.3.5.8.13.21. ... (출력결과의 일부)
//		fibonacci(0, 1);									//TODO

		// 9. 0부터 100사이의 숫자 하나를 뽑아서 두자리를 합한 결과
		// ex. 38이 랜덤하게 나와야한다. 그 결과는 11, 87 -> 15
//		int randomNumber1 = (int)(Math.random()*100)+1;
//		System.out.println((randomNumber1/10)+(randomNumber1%10));

//		System.out.println("------");
		// 10. 0부터 100사이의 숫자르 10개 출력하고 10자리의 1(단)자리의 합을 출력하세요(단, 배열 사용하지 말것)
//		int result1 = 0;
//		for (int j = 0; j < 10; j++) {
//			int randomNumber2 = (int)(Math.random()*100)+1;
//			System.out.println(randomNumber2%10);
//			result1 = result1+ randomNumber2%10;
//		}
//		System.out.println(">>"+result1);

		// 11. 100부터 1000사이의 숫자를 랜덤하게 10개 뽑는다 (단, 반드시 10개를 출력한다)
		// 제약조건 같은 숫자가 중복 되어서는 안된다. (123 ㅇㅋ 122 ㄴㄴ 141 ㄴㄴ 한칸에 중복되는 숫자가 있으면 안된다)
//		int whileCount=0;
//		while(whileCount!=10) {
//			int randomNumber3 = (int)(Math.random()*1000)+10;
//			int th=randomNumber3/100,te=(randomNumber3%100)/10,on=randomNumber3%10;
//			if(th!=te && th!=on && te!=on) {
//			System.out.println(randomNumber3+" : "+(randomNumber3/100)+"/"+(randomNumber3%100)/10+"/"+randomNumber3%10);
//			whileCount++;
//			}
//		}

		// 12. Integer.MaxValue를 이용해서 랜덤하게 숫자를 하나 출력하고, 그렇게 나온 숫자를
		// ex. 123456 -> 출력결과 : 6 5 4 3 2 1
//		int temp = (int)(Math.random()*Integer.MAX_VALUE)+1;
//		System.out.println(temp + "/ "+temp/1000000000);
//		int ten =10;
//		//거꾸로 계산 
//		while (temp/ten==0 ) {
//			//Integer.b
//		}
//		
//		
//		
//		
//		//13. 다음을 초로 환산하라 
//		int h = 2,m=17,s=45;//시분초의 약자
//		int result = 0;
//		for (i = 1 ; i <= h; i++) {
//			result += 60*60;
//			for (int j = 1; j <= m; j++) {
//				result += 60;
//			}
//		}
//		result +=s;
//		System.out.println(result+"초");
//		//14. 다음을 시분초로 환산하라 
//		s = 123456;
//		h = s / (60*60);
//		s -=h*(60*60);
//		m = s /60;
//		s -= m*60;
//		System.out.println(h+"시간"+m+"분"+s+"초");
//		
//		
		// 15. 랜덤하게 o와 x를 10개 출력 ooxxoxooox : o =3 x = 2 (단, 배열 사용 불가)
		// o와 x가 연속해서 가장 많이 나온 횟수를 구하라
		int oCount = 0, xCount = 0, temp = 3;
		for (int j = 0; j < 10; j++) {
			int oxRandom = (int) (Math.random() * 2);
			System.out.println(oxRandom + " : " + ((oxRandom == 0) ? 'x' : 'o'));
			if (oxRandom == 1 && oxRandom == temp) {
				++oCount;
				oCount += (temp == 0) ? 1 : 0;
			} else if (oxRandom == 0 && oxRandom == temp) {
				++xCount;
				xCount += (temp == 1) ? 1 : 0;

			}
//			oCount = oxRandom==temp? oCount+1:oCount+0;
//			xCount = oxRandom==temp? xCount+0:xCount+1;
			temp = oxRandom;
		}
		System.out.println("o : " + oCount + " x : " + xCount);
		
		///@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 쌤한거
		
		short oddCount =0, EvenCount=0,MaxEven=0,MaxOdd=0;
		for(short q =0;q<10;q++) {
			int num = (new Random()).nextInt(2);
			System.out.print(num+ "  ");
			if(num==1) {
				EvenCount = 0;
				oddCount++;
				if(oddCount>MaxOdd) {MaxOdd=oddCount;
			}else {
				oddCount =0;
				EvenCount++;
				if(EvenCount>MaxEven) {
					MaxEven=EvenCount;
				}
			}
		}
			System.out.println();
			System.out.print("odd "+MaxOdd);
			System.out.print("even "+MaxEven);
		
		
		}
		
		
		
		
		
		
		
		

		// 16. 2019년도 1월 1일이 화요일인것을 이미 알고있을 때,
		// 2019년도 달력을 출력하세요
//		String[] week = {"SUN","MON","THU","WHE","THE","FRI","SET"};
//		
//		for(i = 1;i<=12;++i) {
//			System.out.println(i+"Month");
//			for (int j = 0; j < week.length; j++) {
//				System.out.print(week[j]+"  ");
//			}System.out.println();	//요일 출력
//			for (int j = 0; j < 7; j++) {
//				//day++;
//				
//			}
		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int initDay = 2;
		for (int j = 0; j < 12; j++) {
			System.out.println(j+1+"Month");
			System.out.println("SUN  MON  THU  WHE  THE  FRI  SET  ");
			for (int j2 = 0; j2 < initDay; j2++) {
				System.out.println("   ");
			}
			for (int j2 = 0; j2 < month[j]; j2++) {
				System.out.printf("%2d   ",j2+1);
				if((initDay+j2)%7==6) {
					System.out.println();
				}
			}
			initDay= (initDay+month[j])%7;
			System.out.println();
			
		}
		
		// }

	}

	public static int square(int num1, int num2) {
		if (num2 == 1) {
			return num1;
		}
		return num1 * square(num1, num2 - 1);
	}

	public static int factorial(int num1) {
		if (num1 == 1) {
			return num1;
		}
		return num1 * factorial(num1 - 1);
	}

	public static int fibonacci(int num1, int num2) {
		System.out.print("(" + num1 + " . " + num2 + ")");
		if (num1 > 40000) {

		}
		return fibonacci(num2, num1 + num2);

	}
}