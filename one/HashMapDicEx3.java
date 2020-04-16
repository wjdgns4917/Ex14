package com.one;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx3 {
	public static void main(String[] args) {
		//단어장
		//내용추가 단어를 콘솔등록
		//삭제
		
		HashMap<String, String>dic=new HashMap<String,String>();//해쉬맵 생성
			//var dic=new HashMap<String, String>();로 간략가능
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1 등록, 2 검색, 3 삭제, 4 종료");
		int selNum=sc.nextInt();
		if (selNum==4) {
			System.out.println("종료");
		}else if (selNum==1) {
			System.out.println("영단어입력");
			String keyStr=sc.next();
			System.out.println("한단어입력");
			String valStr=sc.next();
			dic.put(keyStr, valStr);
		}else if (selNum==2) {
			System.out.println("단어검색");
			String eng=sc.next();
			String kor=dic.get(eng);
			if (kor==null) 
				System.out.println("단어없음");
			else
				System.out.println(kor);}
		
		sc.close();
	}
}
