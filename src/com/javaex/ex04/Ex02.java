package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {

		//Integer 관리
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(24);
		Integer i03 = new Integer(7);
		int i04 = 100;
		Integer i05 = new Integer(3);
		Integer i06 = new Integer(17);
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04);	//자동 박싱
		iSet.add(i05);
		iSet.add(i06);
		
		iSet.remove(13);
		
		//순서 상관 없이 출력
		for(Integer i : iSet) {
			System.out.println(i.toString());
		}
		
		//개수 4개 --> 중복 적용X
		System.out.println("개수:" + iSet.size());
		
		System.out.println(iSet.toString());
		
		System.out.println("====================================");
		
		//Point 관리
		Point p01 = new Point(3, 13);
		Point p02 = new Point(4, 14);
		Point p03 = new Point(5, 15);
		Point p04 = new Point(3, 13);
		
		Set<Point> pSet = new HashSet<Point>();
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);
		
		pSet.remove(p01);
		
		//순서 상관 없이 출력
		for(Point p : pSet) {
			System.out.println(p.getX());
		}
		
		System.out.println("개수:" + pSet.size());
		
		System.out.println(pSet.toString());
		
	}

}
