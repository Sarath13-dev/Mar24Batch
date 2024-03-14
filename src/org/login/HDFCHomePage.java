package org.login;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.FileUtils;

public class HDFCHomePage {
//Class - inside - Method - Outside - Instance Variable
	private String customerId;//Ram username is correct
	
	private int password;//1
	
	
	public void setCustomerId(String input1) {
		if(input1.equals("Ram")) {
			customerId="Ram Username is Correct";
		}
		else if(input1.equals("Babu")) {
			customerId="Babu Username is Correct";
		}
		else if(input1.equals("Ravi")) {
			customerId="Ravi Username is Correct";
		}
		else {
			customerId="Invalid Username";
		}
	}
	
	
	public void setPassword(int pass1) {
		if(pass1==123 && customerId.equals("Ram Username is Correct")) {
			password=1;
		}
		else if(pass1==321 && customerId.equals("Babu Username is Correct")) {
			password=2;
		}
		else if(pass1==222 && customerId.equals("Ravi Username is Correct")) {
			password=3;
		}
		else {
			password=0;
		}
		
	}
	
	public String getCustomerId() throws IOException {
		if(password==1) {
			Map<String, String> readDataFromDb = readDataFromDb();
			Set<Entry<String, String>> entrySet = readDataFromDb.entrySet();
			for(Entry<String, String> e: entrySet) {
				if(e.getKey().equals("Ram")) {
					System.out.println(e);
				}
			}
			return null;
		}
		else if(password==2) {
			Map<String, String> readDataFromDb = readDataFromDb();
			Set<Entry<String, String>> entrySet = readDataFromDb.entrySet();
			for(Entry<String, String> e: entrySet) {
				if(e.getKey().equals("Babu")) {
					System.out.println(e);
				}
			}
			return null;
		}
		else if(password==3) {
			Map<String, String> readDataFromDb = readDataFromDb();
			Set<Entry<String, String>> entrySet = readDataFromDb.entrySet();
			for(Entry<String, String> e: entrySet) {
				if(e.getKey().equals("Ravi")) {
					System.out.println(e);
				}
			}
			return null;
		}
		else {
			return "InValid User";
		}
	}
	
	public int getPassword() {
		return 0;
	}
	
	public Map<String, String> readDataFromDb() throws IOException {
		File f = new File("C:\\Users\\LENOVO\\newEclipseWorkspe\\HDFCBank\\DataBase\\HDFCDatabase.txt");
		List<String> readLines = FileUtils.readLines(f);
		Map<String, String> m = new LinkedHashMap();
		for(int i=0; i<readLines.size(); i++) {
			String string = readLines.get(i);
			String[] split = string.split(",");//{Ram, 123, 10000}
			m.put(split[0], split[2]);
		}
		
		return m;
		
	}
}
