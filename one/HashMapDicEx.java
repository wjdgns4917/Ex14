package com.one;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {
	public static void main(String[] args) {
		HashMap<String, String>dic=new HashMap<String,String>();//해쉬맵 생성
			//var dic=new HashMap<String, String>();로 간략가능
		
		//3개의 (key,value)쌍을 dic에 저장
		dic.put("baby", "아기");//"baby"는 key, "아기"는 value
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		//사용자로부터 영어 단어를 입력받고 한글단어 검색."exit"입력받으면 종료
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("찾고싶은 단어는?");
			String eng=sc.next();
			if (eng.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			//해쉬맵에서 '키' eng의 '값'kor 검색
			String kor=dic.get(eng);
			if(kor==null)
				System.out.println(eng+"는 없는 단어입니다.");
			else
				System.out.println(kor);
		}
		sc.close();
	}
}
