package com.one;

import java.util.HashMap;
import java.util.Scanner;

class Student{
	private int id;
	private String tel;
	public Student(int id, String tel) {this.id=id;this.tel=tel;}
	public int getId() {return id;}
	public String getTel() {return tel;}
}
public class HashMapStudentEx {
	public static void main(String[] args) {
		HashMap<String, Student>map=new HashMap<>();
		map.put("Ȳ����", new Student(1,"010-111-1111"));
		map.put("���繮", new Student(2,"010-222-2222"));
		map.put("�賲��", new Student(3,"010-333-3333"));
		
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("�˻��� �̸�?");
			String name=sc.nextLine();
			if(name.equals("exit")) {
				System.out.println("����");
				break;}
			Student st=map.get(name);
			if (st==null)
				System.out.println(name+"�� ���� ����Դϴ�.");
			else
				System.out.println("id:"+st.getId()+", ��ȭ:" +st.getTel());
		}
		sc.close();
	}
}
