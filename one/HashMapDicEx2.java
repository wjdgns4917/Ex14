package com.one;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx2 {
	public static void main(String[] args) {
		//�ܾ���
		//�����߰� �ܾ �ֵܼ��
		//����
		
		HashMap<String, String>dic=new HashMap<String,String>();//�ؽ��� ����
			//var dic=new HashMap<String, String>();�� ��������
	
		Scanner sc=new Scanner(System.in);
		System.out.println("���ܾ��Է�");
		String keyStr=sc.next();
		System.out.println("�Ѵܾ��Է�");
		String valStr=sc.next();
		dic.put(keyStr, valStr);
		
		//����ڷκ��� ���� �ܾ �Է¹ް� �ѱ۴ܾ� �˻�."exit"�Է¹����� ����
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
