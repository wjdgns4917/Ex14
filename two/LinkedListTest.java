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
		//ArrayList�� LinkedList������
//		���Ի����� ����� ���� ����Ҷ���
//		ArrayList���ٴ� LinkedList�� �� ȿ����
	}
}
