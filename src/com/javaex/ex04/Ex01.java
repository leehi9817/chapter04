package com.javaex.ex04;

// 자동 import: ctrl + shift + O
import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		
		Point p01 = new Point(2, 2);
		Point p02 = new Point(3, 3);
		Point p03 = new Point(7, 7);
		
		List<Point> pList = new ArrayList<Point>();
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		//갯수 출력하기
		System.out.println(pList.size());
		
		//관리되고 있는 Point에 접근하기
		System.out.println(pList.get(1).getX());
		System.out.println(pList.get(1).toString());
		
		//전체 출력하기
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("==================================");
		//데이터 지우기
		pList.remove(1);
		//List.remove(p02);
		
		System.out.println(pList.size());
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("==================================");
		System.out.println(pList.get(1).toString());
		
		System.out.println("==================================");
		pList.add(1, p02);
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("==================================");
		System.out.println(pList.toString());
		
		System.out.println("==================================");
		//향상된 for문 (처음부터 끝까지)
		for(Point p : pList) {
			System.out.println(p.getX());
		}
		
	}

}
