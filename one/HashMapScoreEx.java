package com.one;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {
	public static void main(String[] args) {
		//이름과 점수를 저장할 HashMap컬렉션 생성
		HashMap<String, Integer>scoreMap=new HashMap<String, Integer>();
		
		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("김남윤", 98);
		scoreMap.put("이재문", 70);
		scoreMap.put("한원선", 99);
		
		System.out.println("HashMap의 요소개수 :"+ scoreMap.size());
		
		//모든 사람의 점수 출력 scoreMap에 들어있는 모든(key,value)쌍 출력
		Set<String>keys=scoreMap.keySet();//모든 key를 가진 set컬렉션 리턴
		Iterator<String>it=keys.iterator();//set에 있는 모든 key를 순서대로 검색하는 Iterator리턴
		
		while (it.hasNext()) { 
			String name=it.next();//다음 키.학생이름
			int score=scoreMap.get(name);//점수 알아내기
			System.out.println(name+ " : "+score);
		}
//		HashMap--순서가 없음
//		TreeSet--알파벳 순서
		
	}
}
