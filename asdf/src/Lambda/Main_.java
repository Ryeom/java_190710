package Lambda;

public class Main_ {
	public static void main(String[] args) {
		/*
		//예제 1
		
		Apple a = new Apple() {
			@Override
			public String func01() {
				return "히히";
			}
		};
		
		Apple a1 = () -> {
			return "히히";
		};
		
		System.out.println(a1.func01());
		*/
		
		/*
		//람다식은 "뉴 클래스명"을 애로우로 만드르땅
		Apple a = () -> {
				return "히히";
		};
		
		Apple a1 = () -> {
			return "히히";
		};
		
		System.out.println(a1.func01());
		*/
		
		//함수는 항상 4가지 형식이당
		
//		Apple a = (num) ->{
//			System.out.println("asdf");
//		};
		
//		Apple b = num ->{		//인수전달이 1개일때만! ()소괄호를 생략할수있다.
//			System.out.println("asdf");
//		};
		// 괄호를 칠때랑 안칠때랑 어떤게 더 선호될까?
		// 일반적으로 다 치자라고 하면 좋겠지만 괄호를 뺀 형태로 많이 나온다.
		
		
//		Apple c = num -> System.out.println("asdf");
		//실행되는 소스코드가 단문장일 경우 스코프를 생략할수있다.
		
//		Apple d = num -> System.out.println("asdf");System.out.println("asdf이거?");
		//람다식으로 두문장을 한줄로 적는다고 하더라도 컴파일러가 인식은 두번째문장을 람다식이 아닌 것으로 해석한다.
		
		//System.out.println(a.func01(0));
		
//		Apple a = (n,s) -> {
//			System.out.println(s+"는"+n);
//		};
		
		
//		Apple a = () ->{return "에에";};
		
//		Apple b = () -> "비비";//스코프 생략시 리턴도 같이 없애자 *중요*
		//실전에서는 밑에꺼가 더 많이 나온다. 
		
		//Apple cc = () -> "100" -> "200";
		//이게 먼디?
		
		//Apple ccc = () ->{ return {return "100"} -> {return "200";} };//함수안에 함수가 있다. IIFE		
		
		
//		Apple a = (s) -> "ss"+s;
//		
//		Apple b = s -> "ss"+s;
		
//		System.out.println(a.func01("asdf"));
		
//		System.out.println(b.func01("dfd"));
		
		//함수의 인수로 코드를 전달한다 : 람다식의 목적
		
		
		Banana b = new Banana() {
			public void func01(int n, String s){
				System.out.println(n+"/"+s);
			}
		};
		
		b.func02(new Apple_() {
			@Override
			public void func01(int n, String s) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Apple_ a;
		b.func02(a = (n,s) ->  {
			System.out.println(n+"/"+s);	
		});
		
		b.func02((n,s)->{
			System.out.println(n+"/"+s);
		});
		
		
		
		
		
	}
	
		
}

interface Apple_ {
	public void func01(int n, String s);
}

class Banana{
	public void func02(Apple_ a) {
		a.func01(222, "히히");
	}
}
