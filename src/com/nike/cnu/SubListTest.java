package com.nike.cnu;

import java.util.ArrayList;
import java.util.List;

public class SubListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> mainList = new ArrayList<Integer>();
		mainList.add(1);
		mainList.add(2);
		mainList.add(3);
		mainList.add(4);
		System.out.println("size of mainList = " + mainList.size());

		int size = mainList.size();
		List<Integer> subList1 = mainList.subList(0, 3);
		System.out.println(subList1);

	}

}
