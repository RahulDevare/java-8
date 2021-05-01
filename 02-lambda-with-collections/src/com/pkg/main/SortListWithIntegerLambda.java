package com.pkg.main;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.pkg.impl.IntegerComparator;
import com.pkg.util.CollectionUtils;

public class SortListWithIntegerLambda {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator integerComparator = (Object arg0, Object arg1) -> {
			return ((Integer)arg0>(Integer)arg1)?-1:((Integer)arg0>(Integer)arg1)?1:0;
		};
		
		CollectionUtils utils = new CollectionUtils();
		List<Integer> list = utils.getIntegerList();
		System.out.println("Before sorting");
		System.out.println(list);
		Collections.sort(list, integerComparator);
		System.out.println("After sorting in descending order:");
		System.out.println(list);
		
		list = utils.getIntegerList();
		System.out.println("Before sorting");
		System.out.println(list);
		Collections.sort(list,(a,b)->(a>b)?-1:(a>b)?1:0);
		System.out.println("After sorting in descending order:");
		System.out.println(list);

		list = utils.getIntegerList();
		System.out.println("Before sorting");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("After sorting in ascending order:");
		System.out.println(list);

	}

}
