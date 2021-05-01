package com.pkg.main;

import java.util.Collections;
import java.util.List;

import com.pkg.impl.IntegerComparator;
import com.pkg.util.CollectionUtils;

public class SortListWithIntegerComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionUtils utils = new CollectionUtils();
		List list = utils.getIntegerList();
		System.out.println("Before sorting");
		System.out.println(list);
		Collections.sort(list, new IntegerComparator());
		System.out.println("After sorting");
		System.out.println(list);

	}

}
