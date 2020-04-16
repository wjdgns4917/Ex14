package com.one;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {
	public static void main(String[] args) {
		//�̸��� ������ ������ HashMap�÷��� ����
		HashMap<String, Integer>scoreMap=new HashMap<String, Integer>();
		
		scoreMap.put("�輺��", 97);
		scoreMap.put("Ȳ����", 88);
		scoreMap.put("�賲��", 98);
		scoreMap.put("���繮", 70);
		scoreMap.put("�ѿ���", 99);
		
		System.out.println("HashMap�� ��Ұ��� :"+ scoreMap.size());
		
		//��� ����� ���� ��� scoreMap�� ����ִ� ���(key,value)�� ���
		Set<String>keys=scoreMap.keySet();//��� key�� ���� set�÷��� ����
		Iterator<String>it=keys.iterator();//set�� �ִ� ��� key�� ������� �˻��ϴ� Iterator����
		
		while (it.hasNext()) { 
			String name=it.next();//���� Ű.�л��̸�
			int score=scoreMap.get(name);//���� �˾Ƴ���
			System.out.println(name+ " : "+score);
		}
//		HashMap--������ ����
//		TreeSet--���ĺ� ����
		
	}
}
