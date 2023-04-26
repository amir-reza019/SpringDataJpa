package com.sum;

import org.springframework.stereotype.Service;

@Service
public class SumOfNum {
	
	public int sum(int a, int b) {
		int res = a+b;
		return res;
	}
}
