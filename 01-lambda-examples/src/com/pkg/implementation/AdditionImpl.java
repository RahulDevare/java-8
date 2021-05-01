package com.pkg.implementation;

import com.pkg.interf.Addition;

public class AdditionImpl implements Addition {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

}
