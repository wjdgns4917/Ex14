package com.one;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {
	public static void main(String[] args) {
		HashMap<String, String>dic=new HashMap<String,String>();//�ؽ��� ����
			//var dic=new HashMap<String, String>();�� ��������
		
		//3���� (key,value)���� dic�� ����
		dic.put("baby", "�Ʊ�");//"baby"�� key, "�Ʊ�"�� value
		dic.put("love", "���");
		dic.put("apple", "���");
		
		//����ڷκ��� ���� �ܾ �Է¹ް� �ѱ۴ܾ� �˻�."exit"�Է¹����� ����
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("ã����� �ܾ��?");
			String eng=sc.next();
			if (eng.equals("exit")) {
				System.out.println("�����մϴ�...");
				break;
			}
			//�ؽ��ʿ��� 'Ű' eng�� '��'kor �˻�
			String kor=dic.get(eng);
			if(kor==null)
				System.out.println(eng+"�� ���� �ܾ��Դϴ�.");
			else
				System.out.println(kor);
		}
		sc.close();
	}
}
