import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// ��α׿� �ø�������
		// 1. �ڹ� ǥ��Ÿ�� �� 8���� �ۼ�
		// byte : 1byte
		// boolean : 1byte
		// char :2byte
		// short : 2byte
		// int :4byte
		// long :4byte
		// float :4byte
		// double :8byte
		// 2. 5�ܸ� ��� 2-1
		int i;
//		for (int i = 0; i < 10; i++) {
//			System.out.println("5 X "+i+" = "+i*5);
//		}
//		for (int i = 0; i < 10; i++) {
//			System.out.printf("5 X %d = %d\n",i,i*5);
//		}
		// 2 - 2
		// printf�� ���� ���
		// 1���� 100���� �ջ� ���α׷� //TODO
//		int i=0,result=0;
//		for (i = 1; i <= 100; i++) {
//			result+=i;
//		}
//		System.out.println(i);

		// 3. Ű����κ��� ���ڸ� �Է¹޴� �ڵ�
//		Scanner sc = new Scanner(System.in);
//		int inputInt = sc.nextInt();

		// 5 - 1. 0���� 100������ ���ڸ� �����ϰ�
//		for ( i = 0; i < 10; i++) {
//			int random1 = (int)(Math.random()*100)+1;
//			System.out.print(random1+" ");
//		}System.out.println();
//		//  - 2. 50���� 100������ ���ڸ� �����ϰ� 10�����
//		for (i = 0; i < 10; i++) {
//			int random2 = (int)(Math.random()*50)+50;
//			System.out.print(random2+" / ");			
//		}System.out.println();
//		//  - 3. -10���� +10������ ���ڸ� �����ϰ� 10�����	
//		for (i = 0; i < 10; i++) {
//			float random3 = (int)(Math.random()*10)-10;
//			System.out.print(random3+" / ");			
//		}System.out.println();
//		//  - 4. 0.0���� 1.0������ ���ڸ� �����ϰ� 10�����	//TODO
//		for (i = 0; i < 10; i++) {
//			float random3 = (float) (Math.random()*1.0);
//			System.out.print(String.format("%.3f", random3)+" / ");			
//		}
//		System.out.println();
//		//  - 5. 0���� 100������ ������ 4�� ����� �����ϰ� ���
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
		// 6. 3�� 4�� Ȥ�� 2�� 7���� �����ִ� ����ƽ �Լ��� ���弼�� (����)
//		System.out.println(square(2, 11));

		// 7. n! n���丮�� �Լ��� ���弼��(��, ����Լ��� ����� ��)
//		System.out.println(factorial(7));
		// 8. �Ǻ���ġ �� 30�ڸ��� ����ϼ���
		// ex. 0.1.1.2.3.5.8.13.21. ... (��°���� �Ϻ�)
//		fibonacci(0, 1);									//TODO

		// 9. 0���� 100������ ���� �ϳ��� �̾Ƽ� ���ڸ��� ���� ���
		// ex. 38�� �����ϰ� ���;��Ѵ�. �� ����� 11, 87 -> 15
//		int randomNumber1 = (int)(Math.random()*100)+1;
//		System.out.println((randomNumber1/10)+(randomNumber1%10));

//		System.out.println("------");
		// 10. 0���� 100������ ���ڸ� 10�� ����ϰ� 10�ڸ��� 1(��)�ڸ��� ���� ����ϼ���(��, �迭 ������� ����)
//		int result1 = 0;
//		for (int j = 0; j < 10; j++) {
//			int randomNumber2 = (int)(Math.random()*100)+1;
//			System.out.println(randomNumber2%10);
//			result1 = result1+ randomNumber2%10;
//		}
//		System.out.println(">>"+result1);

		// 11. 100���� 1000������ ���ڸ� �����ϰ� 10�� �̴´� (��, �ݵ�� 10���� ����Ѵ�)
		// �������� ���� ���ڰ� �ߺ� �Ǿ�� �ȵȴ�. (123 ���� 122 ���� 141 ���� ��ĭ�� �ߺ��Ǵ� ���ڰ� ������ �ȵȴ�)
//		int whileCount=0;
//		while(whileCount!=10) {
//			int randomNumber3 = (int)(Math.random()*1000)+10;
//			int th=randomNumber3/100,te=(randomNumber3%100)/10,on=randomNumber3%10;
//			if(th!=te && th!=on && te!=on) {
//			System.out.println(randomNumber3+" : "+(randomNumber3/100)+"/"+(randomNumber3%100)/10+"/"+randomNumber3%10);
//			whileCount++;
//			}
//		}

		// 12. Integer.MaxValue�� �̿��ؼ� �����ϰ� ���ڸ� �ϳ� ����ϰ�, �׷��� ���� ���ڸ�
		// ex. 123456 -> ��°�� : 6 5 4 3 2 1
//		int temp = (int)(Math.random()*Integer.MAX_VALUE)+1;
//		System.out.println(temp + "/ "+temp/1000000000);
//		int ten =10;
//		//�Ųٷ� ��� 
//		while (temp/ten==0 ) {
//			//Integer.b
//		}
//		
//		
//		
//		
//		//13. ������ �ʷ� ȯ���϶� 
//		int h = 2,m=17,s=45;//�ú����� ����
//		int result = 0;
//		for (i = 1 ; i <= h; i++) {
//			result += 60*60;
//			for (int j = 1; j <= m; j++) {
//				result += 60;
//			}
//		}
//		result +=s;
//		System.out.println(result+"��");
//		//14. ������ �ú��ʷ� ȯ���϶� 
//		s = 123456;
//		h = s / (60*60);
//		s -=h*(60*60);
//		m = s /60;
//		s -= m*60;
//		System.out.println(h+"�ð�"+m+"��"+s+"��");
//		
//		
		// 15. �����ϰ� o�� x�� 10�� ��� ooxxoxooox : o =3 x = 2 (��, �迭 ��� �Ұ�)
		// o�� x�� �����ؼ� ���� ���� ���� Ƚ���� ���϶�
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
		
		///@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ���Ѱ�
		
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
		
		
		
		
		
		
		
		

		// 16. 2019�⵵ 1�� 1���� ȭ�����ΰ��� �̹� �˰����� ��,
		// 2019�⵵ �޷��� ����ϼ���
//		String[] week = {"SUN","MON","THU","WHE","THE","FRI","SET"};
//		
//		for(i = 1;i<=12;++i) {
//			System.out.println(i+"Month");
//			for (int j = 0; j < week.length; j++) {
//				System.out.print(week[j]+"  ");
//			}System.out.println();	//���� ���
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