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
		map.put("황기태", new Student(1,"010-111-1111"));
		map.put("이재문", new Student(2,"010-222-2222"));
		map.put("김남윤", new Student(3,"010-333-3333"));
		
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("검색할 이름?");
			String name=sc.nextLine();
			if(name.equals("exit")) {
				System.out.println("종료");
				break;}
			Student st=map.get(name);
			if (st==null)
				System.out.println(name+"은 없는 사람입니다.");
			else
				System.out.println("id:"+st.getId()+", 전화:" +st.getTel());
		}
		sc.close();
	}
}
