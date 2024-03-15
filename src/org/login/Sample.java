package org.login;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample {
	
	public static void main(String[] args) {
		
		int [] a = {1, 2, 3, 5};
		List<Integer> li = new ArrayList();
		for(int i=0; i<a.length; i++) {
			li.add(a[i]);
		} 
		Integer max = Collections.max(li);
		Integer min = Collections.min(li);
		for(int i=min; i<max; i++) {
			if(!li.contains(i)) {
				System.out.println(i);
			}
		}
		System.out.println("Dev Branch");
		System.out.println("Work Done by Dev");
		System.out.println("QA Work");
		System.out.println("Work done by QA");
		
		
	}

}
