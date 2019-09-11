package day01;

public class Test01 {
	public static void main(String[] args) {
		int a = 1, b = 2, c = 3;
		// 삼항연산자(a,b,c중간값찾기)
		//에이랑 비랑 크니? 에이가커 비랑씨는? 비가커
		//int temp = ((a>b)?     ((b>c)? b:((a>c)? a:c) ):());
		// 콜라츠 추측
		int n = 11;
		while (!(n == 1)) {
			n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
		}
		System.out.println(n);
		// for문
		for (int i = 0; i < 10; ++i) {
		}
		for (int i = 1; i <= 10; i++) {
		}
		for (int i = -5; i < 5; ++i) {
		} // 이건 최적화 시 많이 쓰임
		// 스위치를 배열로

		//랜덤만들깅
		int num = (int)(Math.random()*100)+1;
		//int num = (int)(Math.random()*최대값)+최소값;

	}
}
