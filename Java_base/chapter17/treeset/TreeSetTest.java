package chapter17.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

			TreeSet<String> treeSet=new TreeSet<String>(); //기본 : 오름차순
			
			treeSet.add("홍길동");
			treeSet.add("강감찬");
			treeSet.add("이순신");
			
			for(String str:treeSet) {
				System.out.println(str);
			}

	}

}
