package org.login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Execution {
	
	public static void main(String[] args) throws IOException {
		
		
		
		
		
		
		HDFCHomePage h = new HDFCHomePage();
		h.setCustomerId("Babu");
		h.setPassword(321);
		
		HDFCHomePage h1 = new HDFCHomePage();
		h1.setCustomerId("Ram");
		h1.setPassword(123);
		
		
		HDFCHomePage h2 = new HDFCHomePage();
		h2.setCustomerId("Ravi");
		h2.setPassword(222);
		
		
		HDFCHomePage h3 = new HDFCHomePage();
		h3.setCustomerId("Ashok");
		h3.setPassword(555);
		
		//User Defined List, Set, Map
		//Collection - Generics - Similar DataTypes - Wrapper class 
		//Wrapper class - Pre defined Wrapper class(Integer, Byte, Short, String, ....) - Pre defined List
		//Wrapper class - User defined Wrapper class(HDFCHomePage , Employee, Company..) - User defined List
		
		
		//Pre defined List
		List<String> li = new ArrayList();
		li.add("java");
		li.add("selenium");
		li.add("python");
		li.add("framework");
		
		
	
		
		
		//User defined List - add Values - objref of Classnames
		List<HDFCHomePage> ul = new ArrayList();
		ul.add(h);
		ul.add(h1);
		ul.add(h2);
		ul.add(h3);
		
		
		//User defined Set
		Set<HDFCHomePage> si = new LinkedHashSet();
		si.add(h);
		si.add(h1);
		si.add(h2);
		si.add(h3);
		
		
		//User defined Map - KEy and Value - Key - Pre defined - Value - User defined
		Map<Integer, HDFCHomePage> m = new LinkedHashMap();
		m.put(10, h);
		m.put(20, h1);
		m.put(30, h2);
		m.put(40, h3);
		
		
		
		System.out.println("===========Pre defined List Iteration=========");
		for(int i=0; i<li.size(); i++) {
			String string = li.get(i);
			System.out.println(string);
		}
		
		
		System.out.println("===============User defined List Iteration==============");
		//Iterate the User defined List, Set, Map 
		for(int i=0; i<ul.size(); i++) {
			HDFCHomePage hdfcHomePage = ul.get(i);
			System.out.println(hdfcHomePage.getCustomerId());
		}
		
		
		System.out.println("==============User defined Set Iteration===============");
		for(HDFCHomePage s:si) {
			System.out.println(s.getCustomerId());
		}
		
		
		System.out.println("============User defined Map Iteration==================");
		//Pair - Entry<Integer, HDFCHomePage>
		Set<Entry<Integer, HDFCHomePage>> entrySet = m.entrySet();
		for(Entry<Integer, HDFCHomePage> e:entrySet) {
//			HDFCHomePage value = e.getValue();
//			System.out.println(value.getCustomerId());
			System.out.println(e.getValue().getCustomerId());
		}
		
	}

}
