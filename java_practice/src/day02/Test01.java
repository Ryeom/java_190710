package day02;

public class Test01 {
	public static void main(String[] args) {
		for(int i =5 ; i <9;++i) {
			System.out.println(i);
		}

		for(int i=0;i<8-5+1;i++) {	//가독성이 좋지않다.
			System.out.println(5+i);
		}
		// 전문가 코드에서 이런 형태가 있다면 메모리나 속도에서 기하급수적인 성능을 발휘할 경우 = 더이상 변형이 불가능하다 = 이상대로 fix해서사용
		
		
		int s = 5,e=8;
		int size = e-s+1;					//이런식으로 연산을 하새오
		for(int i=0;i<size;i++) {			//일반적으로 이런식으로 사용하게된다.
											//연산이 반복횟수안에 들어가게되면
			System.out.println(5+i);		//결과적으로는 이렇게 나온다.
		}
		
		
		int i = 0;
		for(i = 0;i<5;++i) ;	//이게모디 (간혹나옴)
		System.out.println(i+10);//결과는 15
		/* 안에서 한문장 이하일 때 스코프가 생략할수 있다. 
		 * 스코프가 생략된 형태라고 보면된다.\
		 * 걍 포문이 돌아버린것
		 * 이렇게 사용하는 이유는 for에서 i를 선언하지않고
		 * 최종 마지막 숫자가 다음 로직에서 사용될때 사용하게 된다.*/
		
		
		//while () {
			
		//}
		
		
	}
}
