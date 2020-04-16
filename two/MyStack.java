package com.two;

class GStack<T>{
	int tos;
	Object[] stck;
	public GStack() {
		tos=0;
		stck=new Object[10];
	}
	public void push(T item) {
		if (tos==10) {
			return;
		}
		stck[tos]=item;
		tos++;
	}
	public T pop() {
		if (tos==0) {
			return null;
		}
		tos--;
		return(T)stck[tos];
	}
}

public class MyStack {
	public static void main(String[] args) {
		GStack<String> stringStack=new GStack<>();
		stringStack.push("seoul1");
		stringStack.push("seoul2");
		stringStack.push("seoul3");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(stringStack.pop());
		}
		GStack<Integer> intStack=new GStack<>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		for (int i = 0; i < 3; i++) 
			System.out.println(stringStack.pop());

	}
}
