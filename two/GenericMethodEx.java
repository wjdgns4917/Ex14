package com.two;

public class GenericMethodEx {
	public static <T> GStack<T> reverse(GStack<T> a) {
		//T가 타입 매개변수인 제네릭 메소드
		GStack<T>s=new GStack<T>();//스택a를 반대로 저장할 목적 GStack생성
		while (true) {
			T tmp;
			tmp=a.pop();//원래 스택에서 요소 하나를 꺼냄
			if (tmp==null) //스택이 비었음
				break;//거꾸로 만드는 작업종료
			else
				s.push(tmp);//새 스택을 리턴
		}		
		return s;
	}
	public static void main(String[] args) {
		GStack<Double>gs=new GStack<>();//Double타입의 GStack생성
		
		for (int i = 0; i < 5; i++) {//5개의 요소를 스택에 push
			gs.push(new Double(i));
		}
		gs=reverse(gs);
		for (int i = 0; i < 5; i++) {
			System.out.println(gs.pop());
		}
	}
}
