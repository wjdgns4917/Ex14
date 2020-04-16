package com.two;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<>();
		list.add("Milk1");
		list.add("Milk2");
		list.add("Milk3");
		list.add("Milk4");
		list.add("Milk5");
		list.add("Milk6");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//ArrayList와 LinkedList차이점
//		삽입삭제가 빈번한 곳에 사용할때는
//		ArrayList보다는 LinkedList가 더 효율적
	}
}
