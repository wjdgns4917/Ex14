package com.one;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx4 {
	public static void main(String[] args) {
		//�ܾ���
		//�����߰� �ܾ �ֵܼ��
		//����
		
		HashMap<String, String>dic=new HashMap<String,String>();//�ؽ��� ����
			//var dic=new HashMap<String, String>();�� ��������
	
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("1 ���, 2 �˻�, 3 ����, 4 ����");
			int selNum=sc.nextInt();
			if (selNum==4) {
			System.out.println("����");
			break;
			}else if (selNum==1) {
			System.out.println("���ܾ��Է�");
			String keyStr=sc.next();
			System.out.println("�Ѵܾ��Է�");
			String valStr=sc.next();
			dic.put(keyStr, valStr);
			}else if (selNum==2) {
			System.out.println("�ܾ�˻�");
			String eng=sc.next();
			String kor=dic.get(eng);
			if (kor==null) 
				System.out.println("�ܾ����");
			else
				System.out.println(kor);}
			else if (selNum==3) {
			System.out.println("�ܾ����");
			String eng=sc.next();
			dic.remove(eng);
		}}
//		sc.close();
	}
}
