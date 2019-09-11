package one;

import java.util.Arrays;

class Apple {

	static void func01() { // 메모리가 생성되엉버렷당
		System.out.println(1);
		func02(); // 이거 에러
		// 얘는 스태틱잉 아니야 당요니 에러
		// 스태틱 함수안에서 함수를 부르고싶으면 그것도 스태틱
	}

	static void func02() {
		System.out.println(2);
	}

	static void func03(int num) {
		// System.out.println(Integer.toBinaryString(num));
		String intet = Integer.toBinaryString(num);
		// System.out.println("----");
		// System.out.println(intet);

		char[] temp = intet.toCharArray();
		String[] result = new String[(temp.length / 4) + 1];
		Arrays.fill(result, "");
		char zero = 48;

		int cnt = 0;
		// System.out.println("else 부분");
		// System.out.println(temp.length % 4);// 0모자름
		for (int i = 0; i < result.length; i++) {
			// result[i]="\t";
			for (int j = 0; j < 4; ++j) {
				if ((temp.length % 4 == 0) || i == 0 && j < (temp.length) % 4) {
					// System.out.println("이건 :" + i + "/" + j);
					result[0] += String.valueOf(zero);
				} else {
					result[i] += temp[cnt];
					// System.out.println(result[i]);
					++cnt;
				}
			}
			result[i] += "\t";
			// System.out.println("결과 : " + result[i]);
		}

		// System.out.println("-----");
		System.out.println(Integer.toHexString(num));
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}

	}

	static void func04(int num) {
		/*
		 * String : const 한번생성되면 내용물 수정불가 crud x StringBuffer : 데이터 갱신가능 curd o
		 * 
		 */
//		String s = "호랑잉";

//		System.out.println("\n/"+s.hashCode());
//		s = "코끼리";
//		System.out.println("/"+s.hashCode());

		System.out.println(Integer.toBinaryString(num));// 이진수가 만들어져
		String s1 = Integer.toBinaryString(num);
		System.out.println(s1.length());
		char[] ar = new char[32 - s1.length()];
		for (int i = 0; i < ar.length; ++i) {
			ar[i]='0';
		}
		String s2 = new String(ar);
		System.out.println(s2);
		String s3 = s2+s1;
		System.out.println(s3+"/"+s3.length());
		
		StringBuffer s4 = new StringBuffer(s2+s1);	//결과는 s3와 같다.
		System.out.println(s4+"/"+s4.length());
		
		//공백넣을거야
		//s4.insert(4,' ');	//맨앞의 인덱스 부터 시작해서
		System.out.println((s4.length()/4)+1);
		for(int i = 0; i <7;++i) {
			//s4.insert((4*i)+i, ' ');
			s4.insert((7-i)*4, ' ');
		}
		
		
		
		System.out.println(s4+"/"+s4.length());
		
	}

	static void func05(int num) {
		String temp1 = Integer.toBinaryString(num);
		System.out.println(temp1);
		int rest = 4-(temp1.length()%4);
		//System.out.println(rest);
		char[] forword = new char[rest];
		for (int i = 0; i < forword.length; ++i) {
			forword[i]='0';
		}
		String temp2 = new String(forword);

		StringBuffer result = new StringBuffer(temp2+temp1);
		int rest2 = (temp1.length()/4 ==0)? 0:1;
		for(int i = 0; i <(temp1.length()/4)+rest2;++i) {
			//s4.insert((4*i)+i, ' ');
			result.insert((((temp1.length()/4)+1)-i)*4, ' ');
		}
		System.out.println(result+"/"+result.length());
		
		
	}
}

public class Test01 {

	void func01() {
	} // 메인에서 쓸수없다

	static void func02() {
	} // 메인에서 쓸수있다. 테스트용도로 써도 좋아

	static void func03(int num) {

	}

	public static void main(String[] args) {
		// Apple.func01();
		//Apple.func03(0x3c94ab78);

		//Apple.func04(0x3c94ab73);
		Apple.func05(0x4ab72);
		/*
		 * short a = 3, b = 1; int c = 2;
		 * 
		 * b = (short)(a + c); //b = a + (short)c;//에러가 뜬다 : 5칙연산이 일어나는 그순간 최종연산을 int로
		 * 받아들이기때문에 중간에 하면 안된다
		 * 
		 * //다형성을 제외하고 대입연산자는 받는놈이고 주는놈이고 타입이 같아야한다 //자바는 5칙연산 모든것을 int로 취급해버림 //주는 놈이
		 * 받는 놈 입장으로
		 */

		
		// long a = 10;//4byte이상 일 경우 가장 큰 타입을 쓰고있는 long이 되어버린다. 
		// int b = 1;
		 //b = (int)a +b; //4byte이하는 
		 

		// System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.toHexString(1234));//10진수를 16진수로 만들어준다.

		//System.out.println(Integer.toHexString(Integer.MAX_VALUE));	//7fffffff//최상위비트가 0이되었으니 7이고 최상위는 fffffff
		/*
		 * 2147483647 4d2 7fffffff
		 */
		// 0x3c94ab73

		//int a = 0386;//이거 왜안돼? 숫자앞에 0이 붙으면 8진수로 해석을한다. 8은 0~7까지기 때문에 8이들어가면 안대
		//int c = 0376; //이건 에러아냐
		//int b = 00037;//이건 왜 에러가 아니지?

		// 주로 문법적으로 8진법, 16진법, 10진법 3가지를 많이 쓴당.

	}

}
